package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.pojo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service//交给springioc(容器管理)后边就可以直接自动装配使用它了
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public boolean login(User user) {
        User dbUser =userDao.selectByPhone(user.getPhone());
        if(dbUser==null){//数据库里面都没有这个人，登录失败
            return false;
        }
        else{
           if(user.getPassword()==null) {
               return false;
           }

           if( user.getPassword().equals(dbUser.getPassword())){//如果传过来的密码等于我在数据库的密码就登录成功
               return true;
           }
        }
        return false;
    }
}
