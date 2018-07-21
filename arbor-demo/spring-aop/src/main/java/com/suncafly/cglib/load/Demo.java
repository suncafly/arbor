package com.suncafly.cglib.load;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-20 5:19 PM
 */
public class Demo {

    public static void main(String[] args) {
        LazyBean lazyBean = new LazyBean("gd", 100);
        lazyBean.getPropertyBean().setKey("mw");
//        System.out.println(val1);
        lazyBean.getPropertyBean().getValue();
//        lazyBean.getPropertyBeanDispatcher().getValue();
//        lazyBean.getPropertyBeanDispatcher().getValue();
    }
}
