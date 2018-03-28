package com.arbor.security.browser.service;

import com.arbor.security.browser.BrowserUserDetailFactory;
import com.arbor.security.browser.modle.User;
import com.arbor.security.browser.respository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * Created by apple on 2018/3/15.
 */
@Component
public class BrowserUserDetailService implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info(" 用户登录名:" + username);
        User user = userRepository.findByUsername(username);
        return BrowserUserDetailFactory.create(user);
    }
}
