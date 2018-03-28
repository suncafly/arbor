package com.arbor.security.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by apple on 2018/3/15.
 */
@ConfigurationProperties(prefix = "com.arbor")
public class SecurityProperties {

    private BrowserProperties browser = new BrowserProperties();

    private SitemeshProperites sitemesh = new SitemeshProperites();

    private ValidateCodeProperties code = new ValidateCodeProperties();

    public BrowserProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }


    public SitemeshProperites getSitemesh() {
        return sitemesh;
    }

    public void setSitemesh(SitemeshProperites sitemesh) {
        this.sitemesh = sitemesh;
    }

    public ValidateCodeProperties getCode() {
        return code;
    }

    public void setCode(ValidateCodeProperties code) {
        this.code = code;
    }
}
