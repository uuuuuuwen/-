package com.example.demo.service;

import com.example.demo.pojo.entity.User;

/**
 * g关于用户的一些业务操作
 */
public interface UserService {
    /**
     * 登录方法，如果登录成功返回true，否则false
     * @param user
     * @return
     */
    boolean login(User user);
}
