package com.example.demo.dao;

import com.example.demo.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface UserDao {
    //根据主键删除
    int deleteByPrimaryKey(Integer userId);
    //插入数据
    int insert(User record);

    /**
     * 选择性插入
     * @param record
     * @return
     */
    int insertSelective(User record);

    //根据主键查询
    User selectByPrimaryKey(Integer userId);
    //根据主键选择性的更新，传了值的字段（属性），就更新，否则就不更新
    int updateByPrimaryKeySelective(User record);
    //更新全部
    int updateByPrimaryKey(User record);

    /**
     * 根据真实姓名查询用户信息
     * @param realName
     * @return
     */
    User selectUserByRealName(String realName);
    /**
     * 根据用户的电话号码查询用户的基本信息
     * @param phone
     * @return
     */
    User selectByPhone(String phone);
}