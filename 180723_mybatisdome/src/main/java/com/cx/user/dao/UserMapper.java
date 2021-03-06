package com.cx.user.dao;

import org.apache.ibatis.annotations.Mapper;

import com.cx.user.model.User;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}