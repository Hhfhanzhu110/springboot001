package com.hanhf.demo.service.impl;

import com.hanhf.demo.dao.UserDao;
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
    private UserDao userDao;

    @Override
    public int addUser(User user ){
        System.out.println("addUser");
        return userDao.addUser(user);
    }

    @Override
    public User queryUser(Integer id){
        System.out.println("queryUser"+" "+id);
        User user = userDao.queryUser(id);
        System.out.println(user);
        return userDao.queryUser(id);
    }
}
