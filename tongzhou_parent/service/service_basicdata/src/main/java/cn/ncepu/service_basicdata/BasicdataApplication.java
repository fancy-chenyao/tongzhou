package cn.ncepu.service_basicdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: Xia Bing
 * @Description: 启动类
 * @Date: Create in 16:21 2020/8/29
 * @Modified By:
 */
@SpringBootApplication
@ComponentScan(basePackages = {"cn.ncepu"})
public class BasicdataApplication {
    public static void main(String[] args) {
        SpringApplication.run(BasicdataApplication.class,args);
    }
}