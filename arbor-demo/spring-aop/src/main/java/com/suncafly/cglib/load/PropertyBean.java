package com.suncafly.cglib.load;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-20 5:15 PM
 */
public class PropertyBean {
    private String key;
    private Object value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PropertyBean [key=" + key + ", value=" + value + "]" + getClass();
    }
}
