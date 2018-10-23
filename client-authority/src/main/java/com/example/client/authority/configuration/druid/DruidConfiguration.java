package com.example.client.authority.configuration.druid;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述：监控配置
 * @author: 曾远征
 * @date: 2018-10-23
 * @time: 23:11
 */
@Configuration
public class DruidConfiguration {

    @Bean
    public ServletRegistrationBean statViewServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        /**
         * 可以配置的参数
         * allow:白名单(String)
         * deny:黑名单(String)
         * loginUsername:登陆用户(String)
         * loginPassword:登陆密码(String)
         * resetEnable:重置数据(String[boolean])
         */
        servletRegistrationBean.addInitParameter("allow", "127.0.0.1");
        servletRegistrationBean.addInitParameter("loginUsername", "zez");
        servletRegistrationBean.addInitParameter("loginPassword", "zez");
        servletRegistrationBean.addInitParameter("resetEnable", "false");
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean statFilter(){
        //创建过滤器
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean(new WebStatFilter());
        //配置过滤器路径
        filterRegistrationBean.addUrlPatterns("/*");
        //忽略过滤的路径
        filterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }
}
