package com.kingyun.gpsinspection.service;

import java.util.List;
import com.kingyun.gpsinspection.domain.Menu;

/**
 * (旧)菜单表Service接口
 *
 * @author kingyun
 * @date 2023-04-28
 */
public interface IMenuService
{
    /**
     * 查询(旧)菜单表
     *
     * @param menuId (旧)菜单表主键
     * @return (旧)菜单表
     */
    public Menu selectMenuByMenuId(String menuId);

    /**
     * 查询(旧)菜单表列表
     *
     * @param menu (旧)菜单表
     * @return (旧)菜单表集合
     */
    public List<Menu> selectMenuList(Menu menu);

    /**
     * 新增(旧)菜单表
     *
     * @param menu (旧)菜单表
     * @return 结果
     */
    public int insertMenu(Menu menu);

    /**
     * 修改(旧)菜单表
     *
     * @param menu (旧)菜单表
     * @return 结果
     */
    public int updateMenu(Menu menu);

    /**
     * 批量删除(旧)菜单表
     *
     * @param menuIds 需要删除的(旧)菜单表主键集合
     * @return 结果
     */
    public int deleteMenuByMenuIds(String menuIds);

    /**
     * 删除(旧)菜单表信息
     *
     * @param menuId (旧)菜单表主键
     * @return 结果
     */
    public int deleteMenuByMenuId(String menuId);
}
