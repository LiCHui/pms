package com.fq.ebusiness.pms.provider.config;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.logging.Slf4jLogFilter;
import com.alibaba.druid.pool.DruidDataSource;

/**
 * 
 * @ClassName: DriudSource 
 * @Description:TODO alibaba driud数据源
 * @author FuQiang
 * @date 2017年8月9日 上午11:27:23
 */
@Configuration
@EnableTransactionManagement
public class DriudSource {

	@Value("${ds.jdbc.url}")
	private String url;
	@Value("${ds.jdbc.username}")
	private String username;
	@Value("${ds.jdbc.password}")
	private String password;
	@Value("${ds.druid.initialSize}")
	private int initialSize;
	@Value("${ds.druid.maxActive}")
	private int maxActive;
	@Value("${ds.druid.minIdle}")
	private int minIdle;
	@Value("${ds.druid.maxWait}")
	private int maxWait;
	@Value("${ds.druid.testOnBorrow}")
	private boolean testOnBorrow;
	@Value("${ds.druid.testOnReturn}")
	private boolean testOnReturn;
	@Value("${ds.druid.testWhileIdle}")
	private boolean testWhileIdle;
	@Value("${ds.druid.timeBetweenEvictionRunsMillis}")
	private long timeBetweenEvictionRunsMillis;
	@Value("${ds.druid.minEvictableIdleTimeMillis}")
	private long minEvictableIdleTimeMillis;
	@Value("${ds.druid.removeAbandoned}")
	private boolean removeAbandoned;
	@Value("${ds.druid.removeAbandonedTimeout}")
	private int removeAbandonedTimeout;
	@Value("${ds.druid.logAbandoned}")
	private boolean logAbandoned;
	@Value("${ds.druid.filters}")
	private String filters;
	
	@Bean(name = "dataSource")
	@Primary
	public DataSource dataSource() throws SQLException{
		DruidDataSource datasource = new DruidDataSource();
//		datasource.setDriverClassName(driverClass);
		datasource.setUrl(url);
	    datasource.setUsername(username);
	    datasource.setPassword(password);
	    datasource.setInitialSize(initialSize);
	    datasource.setMaxActive(maxActive);
	    datasource.setMinIdle(minIdle);
	    datasource.setMaxWait(maxWait);
	    datasource.setTestOnBorrow(testOnBorrow);
	    datasource.setTestOnReturn(testOnReturn);
	    datasource.setTestWhileIdle(testWhileIdle);
	    datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
	    datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
	    datasource.setRemoveAbandoned(removeAbandoned);
	    datasource.setRemoveAbandonedTimeout(removeAbandonedTimeout);
	    datasource.setLogAbandoned(logAbandoned);
	    datasource.setFilters(filters);
	    List<Filter> filters = new ArrayList<Filter>();
	    Slf4jLogFilter filter = new Slf4jLogFilter();
		filter.setStatementExecutableSqlLogEnable(true);
		filters.add(filter);
	    datasource.setProxyFilters(filters);
	    return datasource;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getInitialSize() {
		return initialSize;
	}

	public void setInitialSize(int initialSize) {
		this.initialSize = initialSize;
	}

	public int getMaxActive() {
		return maxActive;
	}

	public void setMaxActive(int maxActive) {
		this.maxActive = maxActive;
	}

	public int getMinIdle() {
		return minIdle;
	}

	public void setMinIdle(int minIdle) {
		this.minIdle = minIdle;
	}

	public int getMaxWait() {
		return maxWait;
	}

	public void setMaxWait(int maxWait) {
		this.maxWait = maxWait;
	}

	public boolean isTestOnBorrow() {
		return testOnBorrow;
	}

	public void setTestOnBorrow(boolean testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}

	public boolean isTestOnReturn() {
		return testOnReturn;
	}

	public void setTestOnReturn(boolean testOnReturn) {
		this.testOnReturn = testOnReturn;
	}

	public boolean isTestWhileIdle() {
		return testWhileIdle;
	}

	public void setTestWhileIdle(boolean testWhileIdle) {
		this.testWhileIdle = testWhileIdle;
	}

	public long getTimeBetweenEvictionRunsMillis() {
		return timeBetweenEvictionRunsMillis;
	}

	public void setTimeBetweenEvictionRunsMillis(long timeBetweenEvictionRunsMillis) {
		this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
	}

	public long getMinEvictableIdleTimeMillis() {
		return minEvictableIdleTimeMillis;
	}

	public void setMinEvictableIdleTimeMillis(long minEvictableIdleTimeMillis) {
		this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
	}

	public boolean isRemoveAbandoned() {
		return removeAbandoned;
	}

	public void setRemoveAbandoned(boolean removeAbandoned) {
		this.removeAbandoned = removeAbandoned;
	}

	public int getRemoveAbandonedTimeout() {
		return removeAbandonedTimeout;
	}

	public void setRemoveAbandonedTimeout(int removeAbandonedTimeout) {
		this.removeAbandonedTimeout = removeAbandonedTimeout;
	}

	public boolean isLogAbandoned() {
		return logAbandoned;
	}

	public void setLogAbandoned(boolean logAbandoned) {
		this.logAbandoned = logAbandoned;
	}

	public String getFilters() {
		return filters;
	}

	public void setFilters(String filters) {
		this.filters = filters;
	}
	
}
