package com.github.xxl.job.admin.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by felton on 2018/4/19.
 */
@ConfigurationProperties(prefix = "xxl.job")
@Configuration
public class XxlConfig {
    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
