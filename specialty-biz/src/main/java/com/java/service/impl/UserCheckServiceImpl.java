package com.java.service.impl;

import com.java.mapper.mapper.UserCheckMapper;
import com.java.model.user.UserCheck;
import com.java.service.service.UserCheckService;
import com.java.util.string.Generate;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chenfer on 2017/3/26.
 */
@Service
public class UserCheckServiceImpl implements UserCheckService {

    @Autowired
    private UserCheckMapper userCheckMapper;
    /**
     * 添加
     */
    public Integer add(UserCheck userCheck){
        return userCheckMapper.add(userCheck);
    }

    /**
     * 查询
     */
    public List<UserCheck> find(UserCheck userCheck){
        return userCheckMapper.find(userCheck);
    }
    /**
     * 注册
     * @param userCheck
     * @return
     */
    public Integer register(UserCheck userCheck){
        userCheck.setUser_id(Generate.generateUserId());
        return this.add(userCheck);
    }
    /**
     * 登录
     * @param userName
     * @param userPwd
     * @return
     */

    public UserCheck login(String userName,String userPwd){
        return userCheckMapper.login(userName,userPwd);
    }
}