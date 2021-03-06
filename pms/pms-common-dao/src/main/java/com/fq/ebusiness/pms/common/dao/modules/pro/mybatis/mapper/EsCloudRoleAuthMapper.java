package com.fq.ebusiness.pms.common.dao.modules.pro.mybatis.mapper;

import com.fq.ebusiness.pms.common.dao.modules.pro.mybatis.entity.EsCloudRoleAuth;
import com.fq.ebusiness.pms.common.dao.modules.pro.mybatis.entity.EsCloudRoleAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EsCloudRoleAuthMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table es_cloud_role_auth
     *
     * @mbg.generated Tue Aug 08 17:18:51 CST 2017
     */
    long countByExample(EsCloudRoleAuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table es_cloud_role_auth
     *
     * @mbg.generated Tue Aug 08 17:18:51 CST 2017
     */
    int deleteByExample(EsCloudRoleAuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table es_cloud_role_auth
     *
     * @mbg.generated Tue Aug 08 17:18:51 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table es_cloud_role_auth
     *
     * @mbg.generated Tue Aug 08 17:18:51 CST 2017
     */
    int insert(EsCloudRoleAuth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table es_cloud_role_auth
     *
     * @mbg.generated Tue Aug 08 17:18:51 CST 2017
     */
    int insertSelective(EsCloudRoleAuth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table es_cloud_role_auth
     *
     * @mbg.generated Tue Aug 08 17:18:51 CST 2017
     */
    List<EsCloudRoleAuth> selectByExample(EsCloudRoleAuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table es_cloud_role_auth
     *
     * @mbg.generated Tue Aug 08 17:18:51 CST 2017
     */
    EsCloudRoleAuth selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table es_cloud_role_auth
     *
     * @mbg.generated Tue Aug 08 17:18:51 CST 2017
     */
    int updateByExampleSelective(@Param("record") EsCloudRoleAuth record, @Param("example") EsCloudRoleAuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table es_cloud_role_auth
     *
     * @mbg.generated Tue Aug 08 17:18:51 CST 2017
     */
    int updateByExample(@Param("record") EsCloudRoleAuth record, @Param("example") EsCloudRoleAuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table es_cloud_role_auth
     *
     * @mbg.generated Tue Aug 08 17:18:51 CST 2017
     */
    int updateByPrimaryKeySelective(EsCloudRoleAuth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table es_cloud_role_auth
     *
     * @mbg.generated Tue Aug 08 17:18:51 CST 2017
     */
    int updateByPrimaryKey(EsCloudRoleAuth record);
}