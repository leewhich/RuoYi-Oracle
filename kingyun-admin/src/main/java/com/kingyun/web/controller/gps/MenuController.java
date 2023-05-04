package com.kingyun.web.controller.gps;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.kingyun.common.annotation.Log;
import com.kingyun.common.enums.BusinessType;
import com.kingyun.gpsinspection.domain.Menu;
import com.kingyun.gpsinspection.service.IMenuService;
import com.kingyun.common.core.controller.BaseController;
import com.kingyun.common.core.domain.AjaxResult;
import com.kingyun.common.utils.poi.ExcelUtil;
import com.kingyun.common.core.page.TableDataInfo;

/**
 * (旧)菜单表Controller
 *
 * @author kingyun
 * @date 2023-04-28
 */
@Controller
@RequestMapping("/gps/menu")
public class MenuController extends BaseController
{
    private String prefix = "gps/menu";

    @Autowired
    private IMenuService menuService;

    @RequiresPermissions("gps:menu:view")
    @GetMapping()
    public String menu()
    {
        return prefix + "/menu";
    }

    /**
     * 查询(旧)菜单表列表
     */
    @RequiresPermissions("gps:menu:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Menu menu)
    {
        startPage();
        List<Menu> list = menuService.selectMenuList(menu);
        return getDataTable(list);
    }

    /**
     * 导出(旧)菜单表列表
     */
    @RequiresPermissions("gps:menu:export")
    @Log(title = "(旧)菜单表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Menu menu)
    {
        List<Menu> list = menuService.selectMenuList(menu);
        ExcelUtil<Menu> util = new ExcelUtil<Menu>(Menu.class);
        return util.exportExcel(list, "(旧)菜单表数据");
    }

    /**
     * 新增(旧)菜单表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存(旧)菜单表
     */
    @RequiresPermissions("gps:menu:add")
    @Log(title = "(旧)菜单表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Menu menu)
    {
        return toAjax(menuService.insertMenu(menu));
    }

    /**
     * 修改(旧)菜单表
     */
    @RequiresPermissions("gps:menu:edit")
    @GetMapping("/edit/{menuId}")
    public String edit(@PathVariable("menuId") String menuId, ModelMap mmap)
    {
        Menu menu = menuService.selectMenuByMenuId(menuId);
        mmap.put("menu", menu);
        return prefix + "/edit";
    }

    /**
     * 修改保存(旧)菜单表
     */
    @RequiresPermissions("gps:menu:edit")
    @Log(title = "(旧)菜单表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Menu menu)
    {
        return toAjax(menuService.updateMenu(menu));
    }

    /**
     * 删除(旧)菜单表
     */
    @RequiresPermissions("gps:menu:remove")
    @Log(title = "(旧)菜单表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(menuService.deleteMenuByMenuIds(ids));
    }
}
