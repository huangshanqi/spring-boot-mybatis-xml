package cn.evilcoder.tutorials.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

import java.util.Arrays;

/**
 * Created by huangshanqi on 2017/7/25.
 */
@Configuration
public class RequestFilterConfig {

    @Bean
    public FilterRegistrationBean requestFilterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setOrder(Ordered.HIGHEST_PRECEDENCE);
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        filterRegistrationBean.setFilter(new RequestFilter());
        return filterRegistrationBean;
    }
}
