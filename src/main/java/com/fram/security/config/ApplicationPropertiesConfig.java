package com.fram.security.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "spring.security")
public class ApplicationPropertiesConfig {
    private List<String> permitAllUrls;

    public List<String> getPermitAllUrls() {
        return permitAllUrls;
    }

    public void setPermitAllUrls(List<String> permitAllUrls) {
        this.permitAllUrls = permitAllUrls;
    }
}
