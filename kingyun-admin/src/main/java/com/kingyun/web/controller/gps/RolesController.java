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
import com.kingyun.gpsinspection.domain.Roles;
import com.kingyun.gpsinspection.service.IRolesService;
import com.kingyun.common.core.controller.BaseController;
import com.kingyun.common.core.domain.AjaxResult;
import com.kingyun.common.utils.poi.ExcelUtil;
import com.kingyun.common.core.page.TableDataInfo;

/**
 * (旧)角色管理Controller
 *
 * @author kingyun
 * @date 2023-04-28
 */
@Controller
@RequestMapping("/gps/roles")
public class RolesController extends BaseController
{
    private String prefix = "gps/roles";

    @Autowired
    private IRolesService rolesService;

    @RequiresPermissions("gps:roles:view")
    @GetMapping()
    public String roles()
    {
        return prefix + "/roles";
    }

    /**
     * 查询(旧)角色管理列表
     */
    @RequiresPermissions("gps:roles:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Roles roles)
    {
        startPage();
        List<Roles> list = rolesService.selectRolesList(roles);
        return getDataTable(list);
    }

    /**
     * 导出(旧)角色管理列表
     */
    @RequiresPermissions("gps:roles:export")
    @Log(title = "(旧)角色管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Roles roles)
    {
        List<Roles> list = rolesService.selectRolesList(roles);
        ExcelUtil<Roles> util = new ExcelUtil<Roles>(Roles.class);
        return util.exportExcel(list, "(旧)角色管理数据");
    }

    /**
     * 新增(旧)角色管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存(旧)角色管理
     */
    @RequiresPermissions("gps:roles:add")
    @Log(title = "(旧)角色管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Roles roles)
    {
        return toAjax(rolesService.insertRoles(roles));
    }

    /**
     * 修改(旧)角色管理
     */
    @RequiresPermissions("gps:roles:edit")
    @GetMapping("/edit/{roleId}")
    public String edit(@PathVariable("roleId") String roleId, ModelMap mmap)
    {
        Roles roles = rolesService.selectRolesByRoleId(roleId);
        mmap.put("roles", roles);
        return prefix + "/edit";
    }

    /**
     * 修改保存(旧)角色管理
     */
    @RequiresPermissions("gps:roles:edit")
    @Log(title = "(旧)角色管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Roles roles)
    {
        return toAjax(rolesService.updateRoles(roles));
    }

    /**
     * 删除(旧)角色管理
     */
    @RequiresPermissions("gps:roles:remove")
    @Log(title = "(旧)角色管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(rolesService.deleteRolesByRoleIds(ids));
    }
}
