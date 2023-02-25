package com.siku.service.impl;

import com.siku.mapper.LostFoundMapper;
import com.siku.pojo.LostFound;
import com.siku.result.AjaxResult;
import com.siku.service.LostFoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lee
 * @date 2022-11-24 15:43:55
 * @description
 */
@Service
public class LostFoundServiceImpl implements LostFoundService {

    @Autowired
    private LostFoundMapper lostFoundMapper;

    @Override
    public AjaxResult getAllLostFound() {
        return new AjaxResult(200,"获取成功",lostFoundMapper.getLostFoundList());
    }

    @Override
    public AjaxResult pubLostFound(LostFound lostFound) {
        if(lostFoundMapper.PubLostFound(lostFound)==1){
            return new AjaxResult(200,"发布成功");
        }else{
            return new AjaxResult(201,"发布失败");
        }
    }

    @Override
    public AjaxResult delLostFound(int id) {
        if(lostFoundMapper.delLostFound(id)==1){
            return new AjaxResult(200,"删除成功");
        }else{
            return new AjaxResult(201,"删除失败");
        }
    }

    @Override
    public AjaxResult updateStatus(int id) {

        if (lostFoundMapper.updateStatus(id) == 1) {
            return new AjaxResult(200, "修改成功");
        } else {
            return new AjaxResult(201, "修改失败");
        }
    }
}
