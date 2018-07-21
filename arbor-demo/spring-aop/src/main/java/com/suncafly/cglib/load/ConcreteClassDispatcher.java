package com.suncafly.cglib.load;

import com.suncafly.cglib.TargetObject;
import net.sf.cglib.proxy.Dispatcher;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-20 5:16 PM
 */
public class ConcreteClassDispatcher implements Dispatcher {

    @Override
    public Object loadObject() throws Exception {
        System.out.println("before Dispatcher...");
        PropertyBean propertyBean = new PropertyBean();
        propertyBean.setKey("xxx");
        propertyBean.setValue(new TargetObject());
        System.out.println("after Dispatcher...");
        return propertyBean;
    }

}
