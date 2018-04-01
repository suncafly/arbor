package com.arbor.security.validate.code;

import com.arbor.AbstractValidateCodeFilter;
import com.arbor.ValidateCodeException;
import com.arbor.ValidateCodeType;
import com.arbor.security.core.properties.SecurityConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by apple on 28/03/2018.
 */

@Component("validateCodeFilter")
public class ValidateCodeFilter extends AbstractValidateCodeFilter {

    @Autowired
    private AuthenticationFailureHandler authenticationFailureHandler;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain chain) throws ServletException, IOException {
         try{
             super.doFilterInternal(request, response, chain);
         }catch (ValidateCodeException e){
             authenticationFailureHandler.onAuthenticationFailure(request, response, e);
             return;
         }
        chain.doFilter(request, response);
    }

    @Override
    public void afterPropertiesSet() throws ServletException {
        super.afterPropertiesSet();
        getUrlMap().put(SecurityConstants.DEFAULT_LOGIN_PROCESSING_URL_FORM, ValidateCodeType.IMAGE);
        getUrlMap().put(SecurityConstants.DEFAULT_LOGIN_PROCESSING_URL_MOBILE, ValidateCodeType.SMS);
    }

}
