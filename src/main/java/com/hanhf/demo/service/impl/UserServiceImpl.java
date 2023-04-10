package com.hanhf.demo.service.impl;

import com.hanhf.demo.dao.UserMapper;
import com.hanhf.demo.pojo.User;
import com.hanhf.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;

@WebService(serviceName = "UserService", // 与接口中指定的name一致
        targetNamespace = "http://service.userService.demo.hanhf.com", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.hanhf.demo.service.UserService"// 接口地址
)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public User queryUser(Integer id) {
        return null;
    }
}
