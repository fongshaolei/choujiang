package com.choujiang.exception;

/**
 * @author fongshaolei
 * @version 1.0.0
 * @ClassName BusinessExceptionCode
 * @Description
 * @createTime 2022/06/14 9:42
 **/
public enum BusinessExceptionCode {
    USER_LOGIN_NAME_EXIST("登录名已存在"),
    LOGIN_USER_ERROR("用户名不存在或密码错误");

    private String desc;

    BusinessExceptionCode(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}