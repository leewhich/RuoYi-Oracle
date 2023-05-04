package com.kingyun.gpsinspection.service;

import java.util.List;
import com.kingyun.gpsinspection.domain.RoleMenu;

/**
 * （旧）角色资源Service接口
 *
 * @author kingyun
 * @date 2023-04-28
 */
public interface IRoleMenuService
{
    /**
     * 查询（旧）角色资源
     *
     * @param roleMenuId （旧）角色资源主键
     * @return （旧）角色资源
     */
    public RoleMenu selectRoleMenuByRoleMenuId(String roleMenuId);

    /**
     * 查询（旧）角色资源列表
     *
     * @param roleMenu （旧）角色资源
     * @return （旧）角色资源集合
     */
    public List<RoleMenu> selectRoleMenuList(RoleMenu roleMenu);

    /**
     * 新增（旧）角色资源
     *
     * @param roleMenu （旧）角色资源
     * @return 结果
     */
    public int insertRoleMenu(RoleMenu roleMenu);

    /**
     * 修改（旧）角色资源
     *
     * @param roleMenu （旧）角色资源
     * @return 结果
     */
    public int updateRoleMenu(RoleMenu roleMenu);

    /**
     * 批量删除（旧）角色资源
     *
     * @param roleMenuIds 需要删除的（旧）角色资源主键集合
     * @return 结果
     */
    public int deleteRoleMenuByRoleMenuIds(String roleMenuIds);

    /**
     * 删除（旧）角色资源信息
     *
     * @param roleMenuId （旧）角色资源主键
     * @return 结果
     */
    public int deleteRoleMenuByRoleMenuId(String roleMenuId);
}
