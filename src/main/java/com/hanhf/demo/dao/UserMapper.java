package com.hanhf.demo.dao;

import com.hanhf.demo.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserMapper继承基类
 */
@Repository
public interface UserMapper extends MyBatisBaseDao<User, Integer> {
   public List<User> findUsers();
}