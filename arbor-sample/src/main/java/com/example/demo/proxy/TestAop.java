package com.example.demo.proxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-05-11 9:59 AM
 */
@Aspect
@Component
public class TestAop {

    @Autowired
    private Map<String, PMapper> pMappers;


    @Pointcut("execution(* com.example.demo.proxy.PRepository.save*(..)) && "+" args(schedule))")
    public void before(Schedule schedule){
        System.out.println("this is before");
    }

    @Before("before(schedule) && this(proxy)")
    public void beforeAdvide(JoinPoint point, Object proxy, Schedule schedule) {
        //处理逻辑
        System.out.println(proxy);
        PRepository pRepository = (PRepository)proxy;
        PMapper pMapper = pMappers.get(schedule.getType());
        pRepository.instance(pMapper);
//        ReflectiveMethodInvocation reflectiveMethodInvocation = (ReflectiveMethodInvocation) point;
//        Method method = reflectiveMethodInvocation.getMethod();
    }
}
