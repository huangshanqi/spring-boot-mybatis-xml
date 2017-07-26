package cn.evilcoder.tutorials;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by huangshanqi on 2017/7/20.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"cn.evilcoder.tutorials"})
@MapperScan(basePackages = {"cn.evilcoder.tutorials.mapper"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
