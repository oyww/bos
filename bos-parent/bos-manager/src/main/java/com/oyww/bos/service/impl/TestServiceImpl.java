package com.oyww.bos.service.impl;

import com.oyww.bos.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String say(String msg) {
        return msg+"返回值";
    }
}
