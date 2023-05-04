package com.kingyun.gpsinspection.service;

import java.util.List;

import com.kingyun.common.core.domain.Ztree;
import com.kingyun.gpsinspection.domain.Employee;
import com.kingyun.gpsinspection.domain.Organization;

/**
 * (旧)组织机构Service接口
 *
 * @author kingyun
 * @date 2023-04-28
 */
public interface IOrganizationService
{
    /**
     * 查询(旧)组织机构
     *
     * @param orgId (旧)组织机构主键
     * @return (旧)组织机构
     */
    public Organization selectOrganizationByOrgId(String orgId);

    /**
     * 查询(旧)组织机构列表
     *
     * @param organization (旧)组织机构
     * @return (旧)组织机构集合
     */
    public List<Organization> selectOrganizationList(Organization organization);

    /**
     * 新增(旧)组织机构
     *
     * @param organization (旧)组织机构
     * @return 结果
     */
    public int insertOrganization(Organization organization);

    /**
     * 修改(旧)组织机构
     *
     * @param organization (旧)组织机构
     * @return 结果
     */
    public int updateOrganization(Organization organization);

    /**
     * 批量删除(旧)组织机构
     *
     * @param orgIds 需要删除的(旧)组织机构主键集合
     * @return 结果
     */
    public int deleteOrganizationByOrgIds(String orgIds);

    /**
     * 删除(旧)组织机构信息
     *
     * @param orgId (旧)组织机构主键
     * @return 结果
     */
    public int deleteOrganizationByOrgId(String orgId);


}
