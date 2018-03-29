package com.arbor;

import com.arbor.configure.ValidateCodeProperties;
import com.arbor.image.ImageCodeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
    @ConditionalOnMissingBean(name = "captchaValidateCodeFilter")
    public ValidateCodeFilter captchaValidateCodeFilter() {
        return new ValidateCodeFilter();
    }
}
