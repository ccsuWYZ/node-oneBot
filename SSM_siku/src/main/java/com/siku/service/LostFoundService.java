package com.siku.service;

import com.siku.pojo.LostFound;
import com.siku.result.AjaxResult;

import java.util.List;

/**
 * @author lee
 * @date 2022-11-24 15:43:13
 * @description
 */
public interface LostFoundService {
    public AjaxResult getAllLostFound();
    public AjaxResult pubLostFound(LostFound lostFound);

    public AjaxResult delLostFound(int id);

    public AjaxResult updateStatus(int id);
}
