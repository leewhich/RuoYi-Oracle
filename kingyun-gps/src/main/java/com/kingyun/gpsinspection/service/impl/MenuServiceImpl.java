package com.kingyun.gpsinspection.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kingyun.gpsinspection.mapper.MenuMapper;
import com.kingyun.gpsinspection.domain.Menu;
import com.kingyun.gpsinspection.service.IMenuService;
import com.kingyun.common.core.text.Convert;

/**
 * (旧)菜单表Service业务层处理
 *
 * @author kingyun
 * @date 2023-04-28
 */
@Service
public class MenuServiceImpl implements IMenuService
{
    @Autowired
    private MenuMapper menuMapper;

    /**
     * 查询(旧)菜单表
     *
     * @param menuId (旧)菜单表主键
     * @return (旧)菜单表
     */
    @Override
    public Menu selectMenuByMenuId(String menuId)
    {
        return menuMapper.selectMenuByMenuId(menuId);
    }

    /**
     * 查询(旧)菜单表列表
     *
     * @param menu (旧)菜单表
     * @return (旧)菜单表
     */
    @Override
    public List<Menu> selectMenuList(Menu menu)
    {
        return menuMapper.selectMenuList(menu);
    }

    /**
     * 新增(旧)菜单表
     *
     * @param menu (旧)菜单表
     * @return 结果
     */
    @Override
    public int insertMenu(Menu menu)
    {
        return menuMapper.insertMenu(menu);
    }

    /**
     * 修改(旧)菜单表
     *
     * @param menu (旧)菜单表
     * @return 结果
     */
    @Override
    public int updateMenu(Menu menu)
    {
        return menuMapper.updateMenu(menu);
    }

    /**
     * 批量删除(旧)菜单表
     *
     * @param menuIds 需要删除的(旧)菜单表主键
     * @return 结果
     */
    @Override
    public int deleteMenuByMenuIds(String menuIds)
    {
        return menuMapper.deleteMenuByMenuIds(Convert.toStrArray(menuIds));
    }

    /**
     * 删除(旧)菜单表信息
     *
     * @param menuId (旧)菜单表主键
     * @return 结果
     */
    @Override
    public int deleteMenuByMenuId(String menuId)
    {
        return menuMapper.deleteMenuByMenuId(menuId);
    }
}
