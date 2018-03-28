package com.arbor.security.browser;

import com.arbor.security.browser.modle.Authority;
import com.arbor.security.browser.modle.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by apple on 2018/3/15.
 */
public class BrowserUserDetailFactory {

    private BrowserUserDetailFactory() {
    }

    public static BrowserUserDetails create(User user) {
        return new BrowserUserDetails(
                user.getId(),
                user.getUsername(),
                user.getFirstname(),
                user.getLastname(),
                user.getEmail(),
                user.getPassword(),
                mapToGrantedAuthorities(user.getAuthorities()),
                user.getEnabled(),
                user.getLastPasswordResetDate()
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<Authority> authorities) {
        return authorities.stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getName().name()))
                .collect(Collectors.toList());
    }
}
