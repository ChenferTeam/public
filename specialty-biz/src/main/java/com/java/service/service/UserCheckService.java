package com.java.service.service;

import com.java.model.user.UserCheck;

import java.util.List;

/**
 * Created by Chenfer on 2017/3/26.
 */
public interface UserCheckService {
    /**
     * 添加
     */
    Integer add(UserCheck userCheck);

    /**
     * 查询
     */
    List<UserCheck> find(UserCheck userCheck);
    /**
     * 注册
     * @param userCheck
     * @return
     */
    Integer register(UserCheck userCheck);
    /**
     * 登录
     * @param userName
     * @param userPwd
     * @return
     */
    UserCheck login(String userName, String userPwd);
}
