package com.siku.utils;

import com.siku.pojo.TikuDetail;
import com.siku.pojo.TikuDetailFormate;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author lee
 * @date 2022-11-27 21:12:31
 * @description
 */
public class FormateTikuDetail {
    public static List<TikuDetailFormate> formateTikudetail(List<TikuDetail> tikuDetailList){
        List<TikuDetailFormate> result=new LinkedList<>();

        Map<String,String> option=new HashMap<>();

        List<Map<String,String>> options=new LinkedList<>();

        String [] op={"A","B","C","D","E","F"};
        for (int i = 0; i < tikuDetailList.size(); i++) {
            TikuDetailFormate tikuDetailFormate=new TikuDetailFormate();
            tikuDetailFormate.setStore(false);
            tikuDetailFormate.setIsAnswer(0);
            tikuDetailFormate.setId(tikuDetailList.get(i).getDetail_id());
            tikuDetailFormate.setQ(tikuDetailList.get(i).getTitle());
            tikuDetailFormate.setBank_id(tikuDetailList.get(i).getBank_id());
            tikuDetailFormate.setType(tikuDetailList.get(i).getType());
            tikuDetailFormate.setChap(tikuDetailList.get(i).getChapter());
            tikuDetailFormate.setParse(tikuDetailList.get(i).getQuestion_parse());
            tikuDetailFormate.setDiff(tikuDetailList.get(i).getQuestion_difficulty());
            for (int j = 0; j < op.length; j++) {
                option.put("label",op[j]);
                option.put("text",tikuDetailList.get(i).whichAnswer(op[j]));
                options.add(option);
                option=new HashMap<>();
            }
            tikuDetailFormate.setOptions(options);
            options=new LinkedList<>();
            tikuDetailFormate.setA(tikuDetailList.get(i).getRight_answer().trim());
            result.add(tikuDetailFormate);
        }
        return result;
    }
}
