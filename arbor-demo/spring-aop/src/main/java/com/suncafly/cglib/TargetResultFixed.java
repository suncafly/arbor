package com.suncafly.cglib;

import net.sf.cglib.proxy.FixedValue;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-20 4:49 PM
 */
public class TargetResultFixed implements FixedValue {

    /**
     * 该类实现FixedValue接口，同时锁定回调值为999
     * (整型，CallbackFilter中定义的使用FixedValue型回调的方法为getConcreteMethodFixedValue，该方法返回值为整型)。
     */
    @Override
    public Object loadObject() throws Exception {
        System.out.println("lock result");
        Object obj = 999;
        return obj;
    }

}