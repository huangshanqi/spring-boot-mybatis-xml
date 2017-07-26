package cn.evilcoder.tutorials.intercepter;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by huangshanqi on 2017/7/25.
 */
@Configuration
public class TokenInterceptorConfig extends WebMvcConfigurerAdapter {

    private final Logger LOGGER = Logger.getLogger(TokenInterceptor.class);

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        LOGGER.info("adding TokenInterceptor ...");
        registry.addInterceptor(new TokenInterceptor()).addPathPatterns("/*").excludePathPatterns("");
    }
}
