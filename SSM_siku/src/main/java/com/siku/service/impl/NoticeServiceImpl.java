package com.siku.service.impl;

import com.siku.mapper.NoticeMapper;
import com.siku.pojo.Notice;
import com.siku.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lee
 * @date 2022-11-24 14:16:52
 * @description
 */
@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;
    @Override
    public Notice getNotice() {
        return noticeMapper.getNotice();
    }
}
