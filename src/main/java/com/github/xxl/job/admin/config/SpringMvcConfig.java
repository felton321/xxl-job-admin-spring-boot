package com.github.xxl.job.admin.config;

import com.xxl.job.admin.controller.interceptor.CookieInterceptor;
import com.xxl.job.admin.controller.interceptor.PermissionInterceptor;
import com.xxl.job.admin.controller.resolver.WebExceptionResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by felton on 2018/4/20.
 */
@Configuration
public class SpringMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new PermissionInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new CookieInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
        exceptionResolvers.add(new WebExceptionResolver());
        super.configureHandlerExceptionResolvers(exceptionResolvers);
    }

    @Override
    public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
        super.extendHandlerExceptionResolvers(exceptionResolvers);
    }
}
