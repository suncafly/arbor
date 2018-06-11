package com.arbor.demo;

import java.util.List;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-06-07 10:19 AM
 */
public class Page<T> {

    //结果集
    private List<T> list;

    public void setList(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }
}
