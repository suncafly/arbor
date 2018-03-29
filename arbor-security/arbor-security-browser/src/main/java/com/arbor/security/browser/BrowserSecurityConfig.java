package com.arbor.security.browser;

import com.arbor.security.browser.authentication.BrowserAuthenticationFailureHandler;
import com.arbor.security.browser.authentication.BrowserAuthenticationSuccessHandler;
import com.arbor.security.core.properties.SecurityConstants;
import com.arbor.security.core.properties.SecurityProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by apple on 2018/3/15.
 */
@Configuration
@EnableWebSecurity
public abstract class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private SecurityProperties securityProperties;

    @Autowired
    private BrowserAuthenticationSuccessHandler browserAuthenticationSuccessHandler;

    @Autowired
    private BrowserAuthenticationFailureHandler browserAuthenticationFailureHandler;
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers(SecurityConstants.DEFAULT_UNAUTHENTICATION_URL,
                        securityProperties.getBrowser().getLoginPage()).permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/authentication/require")
                .loginProcessingUrl("/authentication/form")
                .successHandler(browserAuthenticationSuccessHandler)
                .failureHandler(browserAuthenticationFailureHandler)
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/logout")
                .permitAll();
        //SecurityConstants.DEFAULT_VALIDATE_CODE_URL_PREFIX+"/image"
    }
}
