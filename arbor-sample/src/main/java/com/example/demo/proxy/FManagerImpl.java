package com.example.demo.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-05-11 3:29 PM
 */
@Component
public class FManagerImpl implements  FManager {


   @Autowired
   private FRepository fRepository;

    @Override
    public void show() {
        fRepository.show();
    }

    @Override
    public void save(Schedule schedule) {
       fRepository.save(schedule);
    }
}
