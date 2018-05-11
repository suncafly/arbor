package com.example.demo.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-05-11 9:29 AM
 */
@Component
public class PManagerImpl implements PManager {

    @Autowired
    private PRepository pRepository;

    @Override
    public void save(Schedule schedule) {
        pRepository.save(schedule);
    }
}
