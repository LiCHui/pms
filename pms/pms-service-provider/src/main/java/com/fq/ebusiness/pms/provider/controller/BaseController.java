package com.fq.ebusiness.pms.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fq.ebusiness.pms.common.dao.modules.pro.mybatis.entity.EsCloudOrg;
import com.fq.ebusiness.pms.common.dao.modules.pro.mybatis.mapper.EsCloudOrgMapper;

/**
 * 
 * @ClassName: BaseController 
 * @Description:TODO  基础服务支持
 * @author FuQiang
 * @date 2017年8月9日 上午12:26:10
 */
@RestController
public class BaseController {

	private final Logger logger = LoggerFactory.getLogger(BaseController.class);
	@Autowired
	private DiscoveryClient client;
	@Autowired
	private EsCloudOrgMapper orgMapper;
	@Autowired
	private RestTemplate template;
	
	@RequestMapping(value = "/add" ,method = RequestMethod.GET)
	public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
		ServiceInstance instance = client.getLocalServiceInstance();
		Integer r = a + b;
		logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
		EsCloudOrg  org = orgMapper.selectByPrimaryKey("1");
		String name = org.getOrgName();
		logger.info("数据库查询结果为：" + name);
        return r;
	}
	
}
