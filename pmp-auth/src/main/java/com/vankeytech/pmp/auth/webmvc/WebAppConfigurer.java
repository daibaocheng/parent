package com.vankeytech.pmp.auth.webmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * webmvc配置
 * @author  xieliang
 */
@Configuration
@EnableWebMvc
public class WebAppConfigurer extends WebMvcConfigurerAdapter {


/*    *//**
     * 配置拦截器的Bean
     * @return
     *//*
    @Bean
    public DemoInterceptor demoInterceptor(){
        return new DemoInterceptor();
    }

    *//**
     * c重写addInterceptors方法，注册拦截器
     * @param registry
     *//*
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //super.addInterceptors(registry);
        registry.addInterceptor(demoInterceptor());
    }*/

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

        viewResolver.setPrefix("classpath:/static");
        viewResolver.setSuffix(".html");
        viewResolver.setViewClass(JstlView.class);
        return  viewResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        registry.addResourceHandler("/").addResourceLocations("classpath:/");
    }
}
