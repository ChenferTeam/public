package com.java.service.impl;

import com.java.service.service.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by Chenfer on 2017/3/25.
 */
@Service
public class TestServiceImpl implements TestService {

    public String test(){
        return "yes this is test service !";
    }
}
