package com.siku.service;


import com.siku.pojo.Test;
import com.siku.result.AjaxResult;

import java.util.List;


public interface TestService {


    AjaxResult getTests(String sno);
}
