package com.siku.service.impl;

import com.siku.constant.CacheConstants;
import com.siku.mapper.TikuMapper;
import com.siku.pojo.Tiku;
import com.siku.result.AjaxResult;
import com.siku.service.TikuService;
import com.siku.utils.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


@Service
public class TikuServiceImpl implements TikuService {

    @Autowired
    private TikuMapper tikuMapper;
    @Autowired
    private RedisCache redisCache;

    @Override
    public AjaxResult selectAll() {
       List<Tiku> tikuList= new LinkedList<>();
       for(String Bankid:tikuMapper.selectBankid()){
           tikuList.add(redisCache.getCacheObject(CacheConstants.TIKU_INFO_KEY+Bankid));
       }
        if(tikuList.isEmpty()){
            System.out.println("题库缓存为空");
            tikuList=tikuMapper.selectTiku();
        }
        return new AjaxResult(200,"获取题库列表成功",tikuList);
    }


    @Override
    public void loadingConfigCache() {
        List<Tiku> tikuList = tikuMapper.selectTiku();
        for (Tiku tiku : tikuList)
        {
            redisCache.setCacheObject(getCacheKey(tiku.getBank_id()), tiku);
        }
    }

    @Override
    public void clearConfigCache() {
        Collection<String> keys = redisCache.keys(CacheConstants.TIKU_INFO_KEY+ "*");
        redisCache.deleteObject(keys);
    }

    @Override
    public void resetConfigCache() {
        clearConfigCache();
        loadingConfigCache();
    }

    /**
     * 设置cache key
     *
     * @param configKey 参数键
     * @return 缓存键key
     */
    private String getCacheKey(String configKey)
    {
        return CacheConstants.TIKU_INFO_KEY + configKey;
    }
    /**
     * 项目启动时，把信息表存到缓存
     */
    @PostConstruct
    public void init()
    {
        loadingConfigCache();
    }
}
