package com.example.demo.controller.pages.front;

import com.example.demo.pojo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 这个类是一个登录的控制器，完成登录检验操作等功能
 */
@Controller
@RequestMapping("/pages/front")
public class LoginController {

    @Resource
    UserService userService;


    @RequestMapping("loginPage")
    String loginPage(){
        return "pages/front/login/loginPage";
    }

    /**
     * 验证用户名密码执行登录操作的方法
     * @return
     */
    @RequestMapping("login")
    String login(User user, Model model){
        if("".equals(user.getPhone())||user.getPhone()==null){
            model.addAttribute("errorMsg","请输入手机号登录!");
            return "pages/front/login/loginPage";
        }
        boolean loginResult=userService.login(user);

        if(loginResult){
            return "index";
        }
        model.addAttribute("errorMsg","登录失败，手机号或密码错误");
        return "pages/front/login/loginPage";
    }
}
