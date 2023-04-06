package com.hanhf.demo.dao;

import com.hanhf.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    public int addUser(User user);

    public User queryUser(Integer userId);
}
