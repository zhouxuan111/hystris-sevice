package com.zx.hystris.sevice.controller;

import com.zx.hystris.sevice.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouxuan
 * @date 2020/7/16 9:23
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("test")
    public String test(@RequestParam("str") String str) {
        testService.test(str);

        return "success";
    }
}
