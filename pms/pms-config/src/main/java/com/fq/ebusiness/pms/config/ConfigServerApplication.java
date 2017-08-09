package com.fq.ebusiness.pms.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName: ConfigServerApplication 
 * @Description:TODO 分布式配置
 * @author FuQiang
 * @date 2017年8月8日 上午10:20:30
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
