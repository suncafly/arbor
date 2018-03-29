package com.arbor.security.configure;

import com.arbor.configure.CaptchaConstants;
import com.arbor.security.browser.BrowserSecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * Created by apple on 29/03/2018.
 */
@Configuration
@EnableWebSecurity
public class DemoWebSecurityConfig extends BrowserSecurityConfig {

    @Autowired
    private ValidateCodeSecurityConfig validateCodeSecurityConfig;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.apply(validateCodeSecurityConfig)
                .and()
                .authorizeRequests()
                .antMatchers(CaptchaConstants.DEFAULT_VALIDATE_CODE_URL_PREFIX + "/image")
                .permitAll();
        super.configure(http);
    }
}
