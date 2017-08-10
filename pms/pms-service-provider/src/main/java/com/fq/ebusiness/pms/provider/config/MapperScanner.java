package com.fq.ebusiness.pms.provider.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@AutoConfigureAfter({MyBatisConfig.class})
@MapperScan(basePackages = {"com.fq.ebusiness.pms.common.dao.modules.*.*.mapper"},sqlSessionFactoryRef = "sqlSessionFactory")
public class MapperScanner {

}
