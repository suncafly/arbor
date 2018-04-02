package com.arbor.domain.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by apple on 03/04/2018.
 */
public class UserRegisterEvent extends ApplicationEvent {

    public UserRegisterEvent(Object source) {
        super(source);
    }
}
