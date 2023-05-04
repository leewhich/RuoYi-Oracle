package com.kingyun.gpsinspection.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kingyun.gpsinspection.mapper.RoleMenuMapper;
import com.kingyun.gpsinspection.domain.RoleMenu;
import com.kingyun.gpsinspection.service.IRoleMenuService;
import com.kingyun.common.core.text.Convert;

/**
 * （旧）角色资源Service业务层处理
 *
 * @author kingyun
 * @date 2023-04-28
 */
@Service
public class RoleMenuServiceImpl implements IRoleMenuService
{
    @Autowired
    private RoleMenuMapper roleMenuMapper;

    /**
     * 查询（旧）角色资源
     *
     * @param roleMenuId （旧）角色资源主键
     * @return （旧）角色资源
     */
    @Override
    public RoleMenu selectRoleMenuByRoleMenuId(String roleMenuId)
    {
        return roleMenuMapper.selectRoleMenuByRoleMenuId(roleMenuId);
    }

    /**
     * 查询（旧）角色资源列表
     *
     * @param roleMenu （旧）角色资源
     * @return （旧）角色资源
     */
    @Override
    public List<RoleMenu> selectRoleMenuList(RoleMenu roleMenu)
    {
        return roleMenuMapper.selectRoleMenuList(roleMenu);
    }

    /**
     * 新增（旧）角色资源
     *
     * @param roleMenu （旧）角色资源
     * @return 结果
     */
    @Override
    public int insertRoleMenu(RoleMenu roleMenu)
    {
        return roleMenuMapper.insertRoleMenu(roleMenu);
    }

    /**
     * 修改（旧）角色资源
     *
     * @param roleMenu （旧）角色资源
     * @return 结果
     */
    @Override
    public int updateRoleMenu(RoleMenu roleMenu)
    {
        return roleMenuMapper.updateRoleMenu(roleMenu);
    }

    /**
     * 批量删除（旧）角色资源
     *
     * @param roleMenuIds 需要删除的（旧）角色资源主键
     * @return 结果
     */
    @Override
    public int deleteRoleMenuByRoleMenuIds(String roleMenuIds)
    {
        return roleMenuMapper.deleteRoleMenuByRoleMenuIds(Convert.toStrArray(roleMenuIds));
    }

    /**
     * 删除（旧）角色资源信息
     *
     * @param roleMenuId （旧）角色资源主键
     * @return 结果
     */
    @Override
    public int deleteRoleMenuByRoleMenuId(String roleMenuId)
    {
        return roleMenuMapper.deleteRoleMenuByRoleMenuId(roleMenuId);
    }
}
