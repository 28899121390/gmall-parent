package com.baizhi.gmall.gmallweb.config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class GmallSwagger2Config {

    @Bean("后台用户模块")
    public Docket userApis() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("后台用户模块")
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.regex("/admin.*"))
                .build()
                .apiInfo(apiInfo())
                .enable(true);
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("商城-后台管理系统平台接口文档")
                .description("提供pms、oms、ums、cms、sms模块的文档")
                .termsOfServiceUrl("http://www.atguigu.com/")
                .version("1.0")
                .build();
    }


    /*
    *
    * 项目开发工具
    *     1.maven高级继承聚合
    *     2.git
    *     3.idea
    * 虚拟化容器技术
    *     1.docker  docker compose
    * 框架
    *     1.spring springmvc 注解式驱动
    *     2.mybatis mybatis-plus
    *     2.springboot高级 自动配置原理
    *     3.dubbo rpc通讯
    *     4.zk
    *     5.elk
    *     6.redis
    *     7.rabbitMQ
    *
    * 实用小技术
    *     1.swagger 接口文档
    *     2.sharding-jdbc 读写分离
    *     3.基于springmvc完成restful风格接口的暴露 并使用postman完成测试
    *     4.Jmeter并发测试工具
    *     5.springcloud
    *
    * */



}
