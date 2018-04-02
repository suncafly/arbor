package com.arbor.domain.service;

import com.arbor.domain.event.UserRegisterEvent;
import com.arbor.domain.modle.User;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by apple on 03/04/2018.
 */
@Service
public class EmailService {

    @EventListener
    @Async
    public void sendMail(UserRegisterEvent userRegisterEvent){
        User user = (User) userRegisterEvent.getSource();
        System.out.println(user.getName());
        System.out.println("发送邮件成功！");
    }

}
