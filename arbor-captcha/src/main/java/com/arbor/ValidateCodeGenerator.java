package com.arbor;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * Created by apple on 27/03/2018.
 */
public interface ValidateCodeGenerator {

    ValidateCode generate(ServletWebRequest request);

}
