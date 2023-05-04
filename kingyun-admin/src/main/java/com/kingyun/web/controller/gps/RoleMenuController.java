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
import com.kingyun.gpsinspection.domain.RoleMenu;
import com.kingyun.gpsinspection.service.IRoleMenuService;
import com.kingyun.common.core.controller.BaseController;
import com.kingyun.common.core.domain.AjaxResult;
import com.kingyun.common.utils.poi.ExcelUtil;
import com.kingyun.common.core.page.TableDataInfo;

/**
 * （旧）角色资源Controller
 *
 * @author kingyun
 * @date 2023-04-28
 */
@Controller
@RequestMapping("/gps/rolemenu")
public class RoleMenuController extends BaseController
{
    private String prefix = "gps/rolemenu";

    @Autowired
    private IRoleMenuService roleMenuService;

    @RequiresPermissions("gps:rolemenu:view")
    @GetMapping()
    public String rolemenu()
    {
        return prefix + "/rolemenu";
    }

    /**
     * 查询（旧）角色资源列表
     */
    @RequiresPermissions("gps:rolemenu:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RoleMenu roleMenu)
    {
        startPage();
        List<RoleMenu> list = roleMenuService.selectRoleMenuList(roleMenu);
        return getDataTable(list);
    }

    /**
     * 导出（旧）角色资源列表
     */
    @RequiresPermissions("gps:rolemenu:export")
    @Log(title = "（旧）角色资源", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RoleMenu roleMenu)
    {
        List<RoleMenu> list = roleMenuService.selectRoleMenuList(roleMenu);
        ExcelUtil<RoleMenu> util = new ExcelUtil<RoleMenu>(RoleMenu.class);
        return util.exportExcel(list, "（旧）角色资源数据");
    }

    /**
     * 新增（旧）角色资源
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存（旧）角色资源
     */
    @RequiresPermissions("gps:rolemenu:add")
    @Log(title = "（旧）角色资源", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RoleMenu roleMenu)
    {
        return toAjax(roleMenuService.insertRoleMenu(roleMenu));
    }

    /**
     * 修改（旧）角色资源
     */
    @RequiresPermissions("gps:rolemenu:edit")
    @GetMapping("/edit/{roleMenuId}")
    public String edit(@PathVariable("roleMenuId") String roleMenuId, ModelMap mmap)
    {
        RoleMenu roleMenu = roleMenuService.selectRoleMenuByRoleMenuId(roleMenuId);
        mmap.put("roleMenu", roleMenu);
        return prefix + "/edit";
    }

    /**
     * 修改保存（旧）角色资源
     */
    @RequiresPermissions("gps:rolemenu:edit")
    @Log(title = "（旧）角色资源", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RoleMenu roleMenu)
    {
        return toAjax(roleMenuService.updateRoleMenu(roleMenu));
    }

    /**
     * 删除（旧）角色资源
     */
    @RequiresPermissions("gps:rolemenu:remove")
    @Log(title = "（旧）角色资源", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(roleMenuService.deleteRoleMenuByRoleMenuIds(ids));
    }
}
