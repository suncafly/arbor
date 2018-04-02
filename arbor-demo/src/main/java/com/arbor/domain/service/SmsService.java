package com.arbor.domain.service;

import com.arbor.domain.event.UserRegisterEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by apple on 03/04/2018.
 */
@Service
public class SmsService implements ApplicationListener<UserRegisterEvent>{

    @Async
    @Override
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
        System.out.println("向用户发送短信消息");
    }
}
