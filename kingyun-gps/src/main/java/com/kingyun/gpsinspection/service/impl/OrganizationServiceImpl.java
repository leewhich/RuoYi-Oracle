package com.kingyun.gpsinspection.service.impl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kingyun.gpsinspection.mapper.OrganizationMapper;
import com.kingyun.gpsinspection.domain.Organization;
import com.kingyun.gpsinspection.service.IOrganizationService;
import com.kingyun.common.core.text.Convert;

/**
 * (旧)组织机构Service业务层处理
 *
 * @author kingyun
 * @date 2023-04-28
 */
@Service
public class OrganizationServiceImpl implements IOrganizationService
{
    @Autowired
    private OrganizationMapper organizationMapper;

    /**
     * 查询(旧)组织机构
     *
     * @param orgId (旧)组织机构主键
     * @return (旧)组织机构
     */
    @Override
    public Organization selectOrganizationByOrgId(String orgId)
    {
        return organizationMapper.selectOrganizationByOrgId(orgId);
    }

    /**
     * 查询(旧)组织机构列表
     *
     * @param organization (旧)组织机构
     * @return (旧)组织机构
     */
    @Override
    public List<Organization> selectOrganizationList(Organization organization)
    {
        return organizationMapper.selectOrganizationList(organization);
    }

    /**
     * 新增(旧)组织机构
     *
     * @param organization (旧)组织机构
     * @return 结果
     */
    @Override
    public int insertOrganization(Organization organization)
    {
        return organizationMapper.insertOrganization(organization);
    }

    /**
     * 修改(旧)组织机构
     *
     * @param organization (旧)组织机构
     * @return 结果
     */
    @Override
    public int updateOrganization(Organization organization)
    {
        return organizationMapper.updateOrganization(organization);
    }

    /**
     * 批量删除(旧)组织机构
     *
     * @param orgIds 需要删除的(旧)组织机构主键
     * @return 结果
     */
    @Override
    public int deleteOrganizationByOrgIds(String orgIds)
    {
        return organizationMapper.deleteOrganizationByOrgIds(Convert.toStrArray(orgIds));
    }

    /**
     * 删除(旧)组织机构信息
     *
     * @param orgId (旧)组织机构主键
     * @return 结果
     */
    @Override
    public int deleteOrganizationByOrgId(String orgId)
    {
        return organizationMapper.deleteOrganizationByOrgId(orgId);
    }


}
