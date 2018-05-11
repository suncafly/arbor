package com.example.demo.proxy;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-05-11 11:25 AM
 */
public abstract class  AbstractRepository implements PRepository {

    protected PMapper pMapper;

    @Override
    public void instance(PMapper pMapper){
        this.pMapper = pMapper;
    }
}
