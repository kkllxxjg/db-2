package com.mw.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
 * 1、SpringApplication创建ServletWebServerApplicationContext(以下简称application-context)
 * 2、application-context扫描Bean等
 * 3、从application-context获取ServletWebServerFactory实例
 * 4、触发application-context创建DispatcherServlet等Bean
 * 5、实际由TomcatServletWebServerFactory这一Bean来创建TomcatWebServer
 * 6、TomcatWebServer启动Tomcat并初始化
 * 7、触发ServletContextInitializer类型的bean被调用。
 *    DispatcherServletRegistrationBean将注册DispatcherServlet到Tomcat
 * 8、Tomcat将HTTP请求交由DispatcherServlet来处理
 */
@SpringBootApplication
public class MyApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MyApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
