package com.siku.utils;

import java.util.Calendar;
import java.util.Date;

public class dateInfo {
    public static int getTommrowWhichWeek(Date d1, Date d2) {//得到明天（因为发课程消息是：今天晚上发明天的课表）是开学的第几周
        // 获得当前日期与本周日相差的天数
        Calendar cd = Calendar.getInstance();
        cd.setTime(d2);
        // 获得今天是一周的第几天，星期日是第一天，星期二是第二天......
        int dayOfWeek = cd.get(Calendar.DAY_OF_WEEK)-1 ; // 因为按中国礼拜一作为第一天所以这里减1
        long daysBetween = (d1.getTime() - d2.getTime() + 1000000) / (60 * 60 * 24 * 1000);
        int weekindex= (int) (daysBetween / 7+1);
        if(dayOfWeek+daysBetween % 7>7){
            weekindex+=1;
        }
        return weekindex;
    }




    public static String getWeekDay() {
        String week = "";
        Date today = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(today);
        int weekday = (c.get(Calendar.DAY_OF_WEEK)+1);
        if(weekday==8){
            week = "星期日";
        }
        if (weekday == 1) {
            week = "星期日";
        } else if (weekday == 2) {
            week = "星期一";
        } else if (weekday == 3) {
            week = "星期二";
        } else if (weekday == 4) {
            week = "星期三";
        } else if (weekday == 5) {
            week = "星期四";
        } else if (weekday == 6) {
            week = "星期五";
        } else if (weekday == 7) {
            week = "星期六";
        }
        return week;
    }



}
