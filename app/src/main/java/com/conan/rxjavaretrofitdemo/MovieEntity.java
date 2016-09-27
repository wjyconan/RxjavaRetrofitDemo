package com.conan.rxjavaretrofitdemo;

import java.util.List;

/**
 * Created by conan on 16/9/24.
 */
public class MovieEntity {

    /**
     * ret : 0
     * msg : ok
     * data : [{"id":"1","title":"无法正常登录如何处理？"},{"id":"2","title":"登录时提示密码错误或忘记密码怎么办？"},{"id":"6","title":"有问题如何与客服人员联系？"},{"id":"7","title":"提示版本更新，没有取消更新按钮，为什么？"},{"id":"8","title":"我已经进行版本升级了，为什么还出现提示？"},{"id":"9","title":"在使用中，如果出现突然退出的情况，如何处理？"}]
     */

    private int ret;
    private String msg;
    /**
     * id : 1
     * title : 无法正常登录如何处理？
     */

    private List<DataBean> data;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String id;
        private String title;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "id='" + id + '\'' +
                    ", title='" + title + '\'' +
                    '}';
        }
    }


}
