package com.arbor.domain.service;

import com.arbor.domain.event.UserRegisterEvent;
import com.arbor.domain.modle.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * Created by apple on 03/04/2018.
 */
@Service
public class UserService{

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void register(User user) {
        applicationEventPublisher.publishEvent(new UserRegisterEvent(user));// <3>
    }


}
