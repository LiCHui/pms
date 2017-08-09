package com.fq.ebusiness.pms.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @ClassName: EurekaServerApplication 
 * @Description:TODO 注册服务器
 * @author FuQiang
 * @date 2017年8月8日 上午10:35:03
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	public static void main(String[] args) {
		
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
