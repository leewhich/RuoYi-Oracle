package com.kingyun.gpsinspection.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kingyun.gpsinspection.mapper.RolesMapper;
import com.kingyun.gpsinspection.domain.Roles;
import com.kingyun.gpsinspection.service.IRolesService;
import com.kingyun.common.core.text.Convert;

/**
 * (旧)角色管理Service业务层处理
 *
 * @author kingyun
 * @date 2023-04-28
 */
@Service
public class RolesServiceImpl implements IRolesService
{
    @Autowired
    private RolesMapper rolesMapper;

    /**
     * 查询(旧)角色管理
     *
     * @param roleId (旧)角色管理主键
     * @return (旧)角色管理
     */
    @Override
    public Roles selectRolesByRoleId(String roleId)
    {
        return rolesMapper.selectRolesByRoleId(roleId);
    }

    /**
     * 查询(旧)角色管理列表
     *
     * @param roles (旧)角色管理
     * @return (旧)角色管理
     */
    @Override
    public List<Roles> selectRolesList(Roles roles)
    {
        return rolesMapper.selectRolesList(roles);
    }

    /**
     * 新增(旧)角色管理
     *
     * @param roles (旧)角色管理
     * @return 结果
     */
    @Override
    public int insertRoles(Roles roles)
    {
        return rolesMapper.insertRoles(roles);
    }

    /**
     * 修改(旧)角色管理
     *
     * @param roles (旧)角色管理
     * @return 结果
     */
    @Override
    public int updateRoles(Roles roles)
    {
        return rolesMapper.updateRoles(roles);
    }

    /**
     * 批量删除(旧)角色管理
     *
     * @param roleIds 需要删除的(旧)角色管理主键
     * @return 结果
     */
    @Override
    public int deleteRolesByRoleIds(String roleIds)
    {
        return rolesMapper.deleteRolesByRoleIds(Convert.toStrArray(roleIds));
    }

    /**
     * 删除(旧)角色管理信息
     *
     * @param roleId (旧)角色管理主键
     * @return 结果
     */
    @Override
    public int deleteRolesByRoleId(String roleId)
    {
        return rolesMapper.deleteRolesByRoleId(roleId);
    }
}
