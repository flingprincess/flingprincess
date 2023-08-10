package com.charon.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("customer")
public class Customer {
    /**
     * 客户编号
     * TableId 注解 描述表的主键对应的字段
     * type:主键生成策略 IdType.AUTO 对应的自动递增策略
     */
    @TableId(value = "cus_id",type = IdType.AUTO)
    private Integer cusId;

    /**
     * 客户姓名
     * @TableField 是非主键字段，用来描述字段对应的列明
     */
    @TableField("cus_name")
    private String cusName;

    /**
     * 客户性别
     */
    @TableField("cus_sex")
    private int cusSex;


    /**
     * 客户年龄
     */
    @TableField("cus_age")
    private int cusAge;

    /**
     * 客户地址
     */
    @TableField("cus_address")
    private String cusAddress;
}
