package com.suncafly.aspectj;

/**
 * ${TODO}
 * @author LiFang
 * @create 2018-07-19 8:36 PM
 */
public aspect DemoAspect {

    pointcut HelloWorldPointCut() : execution(* com.suncafly.aspectj.Demo.show(..));

    before() : HelloWorldPointCut(){
        System.out.println("DemoAspect world");
    }

}
