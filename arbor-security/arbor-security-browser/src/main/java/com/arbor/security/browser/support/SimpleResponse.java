package com.arbor.security.browser.support;

/**
 * Created by apple on 2018/3/15.
 */

public class SimpleResponse {

    public SimpleResponse(Object content){
        this.content = content;
    }

    private Object content;

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

}
