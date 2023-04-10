package com.hanhf.demo.dao;

import com.hanhf.demo.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * UserMapper继承基类
 */
@Repository
public interface UserMapper extends MyBatisBaseDao<User, Integer> {
}