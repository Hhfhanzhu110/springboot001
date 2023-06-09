package com.hanhf.demo.service;

import com.hanhf.demo.pojo.User;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.text.ParseException;
import java.util.List;

@WebService(name = "UserService", // 暴露服务名称
        targetNamespace = "http://service.userService.demo.hanhf.com"// 命名空间,一般是接口的包名倒序
)
public interface UserService {

    public int addUser(User user);

    public User queryUser(Integer id);

    public List<User> findUsers();
}


