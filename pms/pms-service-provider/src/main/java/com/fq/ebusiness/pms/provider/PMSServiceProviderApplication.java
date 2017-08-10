package com.fq.ebusiness.pms.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @ClassName: PMSServiceProviderApplication 
 * @Description:TODO 服务提供
 * @author FuQiang
 * @date 2017年8月9日 上午12:18:46
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = { "com.fq.ebusiness.pms" })
public class PMSServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PMSServiceProviderApplication.class, args);
	}
	
}
