package cn.evilcoder.tutorials.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by huangshanqi on 2017/7/25.
 */
public class RequestFilter implements Filter {

    private final Logger LOGGER = LoggerFactory.getLogger(RequestFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        LOGGER.info("[begin RequestFilter ]");
        LOGGER.info("request url = {}", request.getRequestURL());
        LOGGER.info("request params = {}", request.getQueryString());
        LOGGER.info("request header = {}", getAllHeader(request));
        LOGGER.info("request ip = {}", request.getRemoteAddr());
        LOGGER.info("[finish RequestFilter]");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    private String getAllHeader(HttpServletRequest request) {
        StringBuilder stringBuffer = new StringBuilder("\n[");
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            String value = request.getHeader(name);
            stringBuffer.append("\n").append(name).append("=").append(value);
        }
        stringBuffer.append("\n]");
        return stringBuffer.toString();
    }

    @Override
    public void destroy() {

    }
}
