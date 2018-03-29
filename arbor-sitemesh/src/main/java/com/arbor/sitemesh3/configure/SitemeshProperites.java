package com.arbor.sitemesh3.configure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by apple on 24/03/2018.
 */
@Configuration
@ConfigurationProperties(prefix = "com.arbor.sitemesh")
public class SitemeshProperites {

    private String contentPath = "";

    private String decoratorPath = "";

    private String excludedPaths = "";

    private boolean open = false;

    public String getContentPath() {
        return contentPath;
    }

    public void setContentPath(String contentPath) {
        this.contentPath = contentPath;
    }

    public String getDecoratorPath() {
        return decoratorPath;
    }

    public void setDecoratorPath(String decoratorPath) {
        this.decoratorPath = decoratorPath;
    }

    public String getExcludedPaths() {
        return excludedPaths;
    }

    public void setExcludedPaths(String excludedPaths) {
        this.excludedPaths = excludedPaths;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
