package com.example.demo.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-05-11 3:41 PM
 */
@Component("fRepository")
public class FRepositoryImpl implements FRepository {

    @Autowired
    private FMapper fMapper;

    @Override
    public void save(Schedule schedule) {
        fMapper.save(schedule);
    }

    @Override
    public void instance(PMapper pMapper) {

    }

    @Override
    public void show() {
        fMapper.show();
    }
}
