package com.example.demo.controller;

import com.example.demo.dao.GoodsDao;
import com.example.demo.dao.UserDao;
import com.example.demo.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
public class IndexController {
    @Resource
    UserDao userDao;

    @RequestMapping("/")//路径匹配

    String index(){

        User user =userDao.selectByPrimaryKey(1);
        return "index";

    }
}
