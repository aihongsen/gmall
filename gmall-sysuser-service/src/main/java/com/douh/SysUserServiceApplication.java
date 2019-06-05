package com.douh;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@EnableDubbo
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@SpringBootConfiguration
@ComponentScan("com.douh.service")
public class SysUserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SysUserServiceApplication.class,args);
    }
}
