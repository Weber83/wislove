package com.wislove.uc.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * Created by 廖双龙 on 2018/3/16.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.wislove.uc.*"})
@MapperScan(basePackages = "com.wislove.uc.mapper")
public class SpringBootUcMain {

    public static  void main(String[] args){
        SpringApplication.run(SpringBootUcMain.class);
    }
}
