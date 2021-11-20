package com.atguigu.gulimall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: gulimall
 * @description:
 * @author: XuJY
 * @create: 2021-11-06 18:42
 **/
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//因为依赖中有mybatis配置内容，需要配置datasource，这里网关不需要使用数据库，因此不加载数据库的自动配置类
@EnableDiscoveryClient
public class GulimallGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallGatewayApplication.class,args);
    }
}
