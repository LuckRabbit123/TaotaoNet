package com.taotao.manager.service.impl;

import com.taotao.mapper.TestMapper;
import com.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public String queryNow() {
        //1.注入mapper
        //2.业务
        //3.调用
        return testMapper.queryNow();
    }
}
