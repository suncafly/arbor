package com.suncafly.aop;

import com.suncafly.exception.ValidateException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-02 10:18 AM
 */

@Component
@Aspect
public class ValidateAspect {

    @Around("execution(* com.suncafly.controller.PersonController.*(..))")
    public Object handleValidateResult(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        for (Object arg : args) {
            if(arg instanceof BindingResult) {
                BindingResult errors = (BindingResult)arg;
                if (errors.hasErrors()) {
                    throw new ValidateException(errors.getAllErrors());
                }
            }
        }

        Object result = pjp.proceed();

        return result;
    }
}
