package com.zeus.manager.common.controller;


import com.zeus.manager.common.param.ResultParam;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestBootController {

    @RequestMapping("/getuser")
    @ResponseBody
    public ResultParam getUser() {
        return ResultParam.SUCCESS_RESULT;
    }
}
