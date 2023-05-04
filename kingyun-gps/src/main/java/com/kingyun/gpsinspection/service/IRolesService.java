package com.kingyun.gpsinspection.service;

import java.util.List;
import com.kingyun.gpsinspection.domain.Roles;

/**
 * (旧)角色管理Service接口
 *
 * @author kingyun
 * @date 2023-04-28
 */
public interface IRolesService
{
    /**
     * 查询(旧)角色管理
     *
     * @param roleId (旧)角色管理主键
     * @return (旧)角色管理
     */
    public Roles selectRolesByRoleId(String roleId);

    /**
     * 查询(旧)角色管理列表
     *
     * @param roles (旧)角色管理
     * @return (旧)角色管理集合
     */
    public List<Roles> selectRolesList(Roles roles);

    /**
     * 新增(旧)角色管理
     *
     * @param roles (旧)角色管理
     * @return 结果
     */
    public int insertRoles(Roles roles);

    /**
     * 修改(旧)角色管理
     *
     * @param roles (旧)角色管理
     * @return 结果
     */
    public int updateRoles(Roles roles);

    /**
     * 批量删除(旧)角色管理
     *
     * @param roleIds 需要删除的(旧)角色管理主键集合
     * @return 结果
     */
    public int deleteRolesByRoleIds(String roleIds);

    /**
     * 删除(旧)角色管理信息
     *
     * @param roleId (旧)角色管理主键
     * @return 结果
     */
    public int deleteRolesByRoleId(String roleId);
}
