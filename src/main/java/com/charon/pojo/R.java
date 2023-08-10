package com.charon.pojo;

import lombok.Data;

/**
 * 统一响应类
 */
@Data
public class R {
    /**
     * 响应信息
     */
    private String msg;
    /**
     * 响应码
     */
    private Integer code;
    /**
     * 响应数据
     */
    private Object data;

    public R(String msg, Integer code, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }
    public R(){}

    //成功的静态函数
    public static R ok(String msg,Object data){
        return new R(msg,200,data);
    }
    //失败的静态函数
    public static R error(String msg,Object data){
        return new R(msg,500,data);
    }
}
