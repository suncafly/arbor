package com.arbor.security.browser.respository;

import com.arbor.security.browser.modle.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by apple on 2018/3/15.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}