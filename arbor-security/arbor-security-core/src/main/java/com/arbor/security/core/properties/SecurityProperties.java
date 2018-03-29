package com.arbor.security.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by apple on 2018/3/15.
 */
@ConfigurationProperties(prefix = "com.arbor")
public class SecurityProperties {

    private BrowserProperties browser = new BrowserProperties();


    public BrowserProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }

}
