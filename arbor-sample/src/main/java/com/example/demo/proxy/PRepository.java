package com.example.demo.proxy;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-05-11 9:30 AM
 */
public interface PRepository {
    void save(Schedule schedule);

    void instance(PMapper pMapper);
}
