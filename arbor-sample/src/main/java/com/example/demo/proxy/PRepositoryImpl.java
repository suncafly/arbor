package com.example.demo.proxy;

import org.springframework.stereotype.Repository;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-05-11 9:30 AM
 */
@Repository
public class PRepositoryImpl extends AbstractRepository {


    @Override
    public void save(Schedule schedule) {
        pMapper.save(schedule);
    }



}
