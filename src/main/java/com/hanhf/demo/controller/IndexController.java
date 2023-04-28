package com.hanhf.demo.controller;

import com.hanhf.demo.basic.controller.BaseController;
import com.hanhf.demo.basic.pojo.page.TableDataInfo;
import com.hanhf.demo.pojo.User;
import com.hanhf.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController extends BaseController {
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/main")
    public String main() {
        return "main";
    }

    @RequestMapping("/list")
    public String list() {
        return "/user/list";
    }

    @PostMapping("/list/result")
    @ResponseBody
    public TableDataInfo lists() {
        startPage();
        List<User> users = userService.findUsers();
        return getDataTable(users);
    }

}
