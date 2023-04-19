package com.siku.service;

import com.siku.pojo.TikuDetail;
import com.siku.result.AjaxResult;

import java.util.List;

public interface TikuDetailService {

    AjaxResult selectAll(String bank_id);


   /**
    * 加载参数缓存数据
    */
   public void loadingConfigCache();

   /**
    * 清空参数缓存数据
    */
   public void clearConfigCache();

   /**
    * 重置参数缓存数据
    */
   public void resetConfigCache();
}
