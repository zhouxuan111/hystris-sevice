package com.zx.hystris.sevice.service.impl;

import com.zx.hystris.sevice.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author zhouxuan
 * @date 2020/7/16 9:22
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public void test(String str) {
        System.out.println(str);
    }
}
