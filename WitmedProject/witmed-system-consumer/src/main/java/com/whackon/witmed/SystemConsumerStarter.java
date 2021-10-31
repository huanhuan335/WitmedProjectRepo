package com.whackon.witmed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b>系统功能模块 - 基础用户 Consumer 端启动类</b>
 * @author Arthur
 * @version 1.0.0
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class SystemConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(SystemConsumerStarter.class, args);
	}
}
