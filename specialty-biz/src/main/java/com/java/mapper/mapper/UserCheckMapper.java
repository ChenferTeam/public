package com.java.mapper.mapper;

import com.java.model.UserCheck;

import java.util.List;


/**
 * Created by Chenfer on 2017/3/26.
 */
public interface UserCheckMapper {
    /**
     * 添加
     */
    Integer add(UserCheck userCheck);

    /**
     * 查询
     */
    List<UserCheck> find(UserCheck userCheck);
}
