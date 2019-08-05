package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	
    //图片存放根路径，从application.yml中读取upload
    @Value("${upload}")
    private String UPLOAD_PATH;
    
    /**
     * 文件上传
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    	//外部静态资源映射路径，用来上传文件
    	String filePath = "file:" + UPLOAD_PATH;
        registry.addResourceHandler("/upload/**").addResourceLocations(filePath);
    }
}
