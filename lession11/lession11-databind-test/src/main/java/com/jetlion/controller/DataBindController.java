package com.jetlion.controller;

import com.jetlion.entity.User;
import com.jetlion.entity.UserList;
import com.jetlion.entity.UserMap;
import com.jetlion.entity.UserSet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataBindController {


    @RequestMapping(value = "/baseType")
    @ResponseBody
    public String baseType(int id) {
        return "id:" + id;
    }

    @RequestMapping(value = "/packageType")
    @ResponseBody
    public String packageType(@RequestParam(value = "id", required = true) Integer id) {
        return "id:" + id;
    }

    @RequestMapping(value = "/arrayType")
    @ResponseBody
    public String arrayType(String[] name) {
        StringBuffer sbf = new StringBuffer();
        for (String item : name) {
            sbf.append(item).append(" ");
        }
        return "name:" + sbf.toString();
    }

    @RequestMapping(value = "/pojoType")
    @ResponseBody
    public String pojoType(User user) {
        return "注册用户信息：" + user;
    }

    @RequestMapping(value = "/listType")
    @ResponseBody
    public String listType(UserList userList) {
        StringBuffer sbf = new StringBuffer();
        for (User user : userList.getUsers()) {
            sbf.append(user);
        }
        return "用户：" + sbf.toString();
    }

    @RequestMapping(value = "/setType")
    @ResponseBody
    public String setType(UserSet userSet) {
        StringBuffer sbf = new StringBuffer();
        for (User user : userSet.getUsers()) {
            sbf.append(user);
        }
        return "用户：" + sbf.toString();
    }

    @RequestMapping(value = "/mapType")
    @ResponseBody
    public String mapType(UserMap userMap) {
        StringBuffer sbf = new StringBuffer();
        for (String key : userMap.getUsers().keySet()) {
            User user = userMap.getUsers().get(key);
            sbf.append(user);
        }
        return "用户：" + sbf.toString();
    }

    @RequestMapping(value = "/jsonType")
    @ResponseBody
    public User jsonType(@RequestBody User user) {
        //修改年龄
        user.setAge(user.getAge() + 10);
        //返回前端
        return user;
    }


}
