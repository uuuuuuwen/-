package com.example.demo.pojo.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * shop_car
 * @author 
 */
@Data
public class ShopCar implements Serializable {
    /**
     * 购物车
     */
    private Integer shopCarId;

    /**
     * 用户的id
     */
    private Integer userId;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 数量
     */
    private Integer count;

    private static final long serialVersionUID = 1L;


    public Integer getShopCarId() {
        return shopCarId;
    }

    public void setShopCarId(Integer shopCarId) {
        this.shopCarId = shopCarId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}