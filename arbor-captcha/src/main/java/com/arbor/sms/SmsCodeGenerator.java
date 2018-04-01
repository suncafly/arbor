/**
 * 
 */
package com.arbor.sms;

import com.arbor.ValidateCode;
import com.arbor.ValidateCodeGenerator;
import com.arbor.configure.ValidateCodeProperties;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author zhailiang
 *
 */
@Component("smsValidateCodeGenerator")
public class SmsCodeGenerator implements ValidateCodeGenerator {

	@Autowired
	private ValidateCodeProperties validateCodeProperties;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.imooc.security.core.validate.code.ValidateCodeGenerator#generate(org.
	 * springframework.web.context.request.ServletWebRequest)
	 */
	@Override
	public ValidateCode generate(ServletWebRequest request) {
		String code = RandomStringUtils.randomNumeric(validateCodeProperties.getSms().getLength());
		return new ValidateCode(code, validateCodeProperties.getSms().getExpireIn());
	}

	public ValidateCodeProperties getValidateCodeProperties() {
		return validateCodeProperties;
	}

	public void setValidateCodeProperties(ValidateCodeProperties validateCodeProperties) {
		this.validateCodeProperties = validateCodeProperties;
	}

}
