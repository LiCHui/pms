package com.fq.ebusiness.pms.common.util;

import java.util.UUID;

/**
 * 
 * @ClassName: CommonUtil 
 * @Description:TODO 通用工具类
 * @author FuQiang
 * @date 2017年8月8日 上午11:38:31
 */
public class CommonUtil {

	/**
	 * *生成uuid*
	 * @return
	 */
	public static String getUUID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
}
