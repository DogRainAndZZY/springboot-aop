package com.zzy.controller;

import com.zzy.entity.User;
import com.zzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/getAll")
    public String getAll(HttpServletRequest request){
        List<User> userList = userService.getAll();
        request.setAttribute("users",userList);
        return "index";
    }
}
