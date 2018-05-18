package com.arbor.security.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by apple on 2018/3/15.
 */
@ConfigurationProperties(prefix = "com.arbor")
public class SecurityProperties {

    private BrowserProperties browser = new BrowserProperties();

    /**
     * 社交登录配置
     */
    private SocialProperties social = new SocialProperties();

    public void setSocial(SocialProperties social) {
        this.social = social;
    }

    public SocialProperties getSocial() {
        return social;
    }

    public BrowserProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }

}
