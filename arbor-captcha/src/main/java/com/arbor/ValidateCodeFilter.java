package com.arbor;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by apple on 28/03/2018.
 */

public class ValidateCodeFilter extends AbstractValidateCodeFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain chain) throws ServletException, IOException {
        try{
            super.doFilterInternal(request, response, chain);
        }catch (ValidateCodeException e){
            e.printStackTrace();
        }
        chain.doFilter(request, response);
    }

}
