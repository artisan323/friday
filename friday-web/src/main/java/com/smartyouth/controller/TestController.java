package com.smartyouth.controller;

import cn.smartyouth.friday.common.util.CommonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class TestController {

    @PostMapping("/login")
    @ResponseBody
    public CommonResult login(String username, String password){
       return CommonResult.success("da");
    }

}
