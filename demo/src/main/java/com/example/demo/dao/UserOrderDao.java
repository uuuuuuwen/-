package com.example.demo.dao;

import com.example.demo.pojo.entity.UserOrder;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface UserOrderDao {
    int deleteByPrimaryKey(String orderId);

    int insert(UserOrder record);

    int insertSelective(UserOrder record);

    UserOrder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(UserOrder record);

    int updateByPrimaryKey(UserOrder record);
}