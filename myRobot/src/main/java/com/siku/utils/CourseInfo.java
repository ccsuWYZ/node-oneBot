package com.siku.utils;

import com.siku.pojo.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseInfo {
    /**
     *
     * @param operateCourse
     * @param currentWeek
     * @return
     */
    public static String formateCourse(List<Course> operateCourse, String currentWeek) {
        List<Course> l = new ArrayList<>();
        for (Course course : operateCourse) {
            String totalWeeksStr = course.getDate();
            String totalWeeksArr[] = totalWeeksStr.split(",");
            for (int i = 0; i < totalWeeksArr.length; i++) {
                if (totalWeeksArr[i].equals(currentWeek)) {
                    l.add(course);
                    break;
                }
            }

        }

        String head ="明日课程" + "\n";
        String ws = "";
        String chain;
        if (l.isEmpty()) {
            chain ="明天是" +dateInfo.getWeekDay() +"\n" +"明日无课程";
        } else {
            for (Course course : l) {
                ws+=course.getOdate()+"\n"+
                        "课程名称："+course.getCname() +
                        "\n" +
                        "起止时间："+course.getStartime() + "—>" + course.getEndtime() +
                        "\n" +
                        "上课地点："+course.getAddress() +
                        "\n" +
                        "授课教师："+course.getTname() +
                        "\n" + "\n";

            }
            chain = "明天是" + dateInfo.getWeekDay() + "\n"+head+ws+"注：课表可能会有变动，以教务处通知为准。";
        }

        return chain;
    }
}
