package com.fq.ebusiness.pms.provider.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.fq.ebusiness.pms.common.interceptor.MyBatisSqlInterceptor;
import com.github.pagehelper.PageHelper;

/**
 * 
 * @ClassName: MyBatisConfig 
 * @Description:TODO mybatis配置
 * @author FuQiang
 * @date 2017年8月9日 下午2:07:06
 */
@Configuration
@EnableTransactionManagement
@AutoConfigureAfter({DriudSource.class})
public class MyBatisConfig implements EnvironmentAware {

	@Autowired
	private DataSource dataSource;
	
	private RelaxedPropertyResolver propertyResolver;
	@Override
	public void setEnvironment(Environment environment) {
		this.propertyResolver = new RelaxedPropertyResolver(environment,"mybatis.");
		
	}
	
	@Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean() {
        try {
            ResourcePatternResolver resourcePatternResolver;
            resourcePatternResolver = new PathMatchingResourcePatternResolver();
            SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
            bean.setDataSource(dataSource);
            bean.setTypeAliasesPackage(propertyResolver.getProperty("typeAliasesPackage"));
            bean.setMapperLocations(resourcePatternResolver.getResources(propertyResolver.getProperty("mapperLocations")));
            Interceptor[] plugins = new Interceptor[2];
            PageHelper page = new PageHelper();
            Properties properties = new Properties();
    		properties.setProperty("dialect", "mysql");
    		properties.setProperty("reasonable", "false");
    		page.setProperties(properties);
    		plugins[0] = page;
    		//sql拦截
    		MyBatisSqlInterceptor sqlPlugin = new MyBatisSqlInterceptor();
    		plugins[1] = sqlPlugin;
    		bean.setPlugins(plugins);
            return bean.getObject();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
	
	/**
	 * 事务控制
	 * @return
	 */
	@Bean(name = "transactionManager")
    public PlatformTransactionManager platformTransactionManager() {
		DataSourceTransactionManager tManager = new DataSourceTransactionManager();
		tManager.setDataSource(dataSource);
		tManager.setNestedTransactionAllowed(true);
		return tManager;
    }
}
