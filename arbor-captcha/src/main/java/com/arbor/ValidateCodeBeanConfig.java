package com.arbor;

import com.arbor.configure.ValidateCodeProperties;
import com.arbor.image.ImageCodeGenerator;
import com.arbor.sms.DefaultSmsCodeSender;
import com.arbor.sms.SmsCodeSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by apple on 27/03/2018.
 */
@Configuration
public class ValidateCodeBeanConfig {

    @Autowired
    private ValidateCodeProperties validateCodeProperties;

    @Bean
    @ConditionalOnMissingBean(name = "imageValidateCodeGenerator")
    public ValidateCodeGenerator imageValidateCodeGenerator() {
        ImageCodeGenerator codeGenerator = new ImageCodeGenerator();
        codeGenerator.setValidateCodeProperties(validateCodeProperties);
        return codeGenerator;
    }


    @Bean
    @ConditionalOnMissingBean(name = "validateCodeFilter")
    public ValidateCodeFilter captchaValidateCodeFilter() {
        return new ValidateCodeFilter();
    }



    @Bean
    @ConditionalOnMissingBean(SmsCodeSender.class)
    public SmsCodeSender smsCodeSender() {
        return new DefaultSmsCodeSender();
    }

}
