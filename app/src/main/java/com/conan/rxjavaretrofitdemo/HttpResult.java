package com.conan.rxjavaretrofitdemo;

public class HttpResult<T> {

    //用来模仿resultCode和resultMessage
    private int ret;
    private String msg;

    //用来模仿Data
    private T data;

    public int getRet() {
        return ret;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

}
