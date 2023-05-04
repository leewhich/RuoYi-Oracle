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
import com.kingyun.gpsinspection.domain.AccountRole;
import com.kingyun.gpsinspection.service.IAccountRoleService;
import com.kingyun.common.core.controller.BaseController;
import com.kingyun.common.core.domain.AjaxResult;
import com.kingyun.common.utils.poi.ExcelUtil;
import com.kingyun.common.core.page.TableDataInfo;

/**
 * (旧)账号角色关联Controller
 *
 * @author kingyun
 * @date 2023-04-28
 */
@Controller
@RequestMapping("/gps/roleEmployee")
public class AccountRoleController extends BaseController
{
    private String prefix = "gps/roleEmployee";

    @Autowired
    private IAccountRoleService accountRoleService;

    @RequiresPermissions("gps:roleEmployee:view")
    @GetMapping()
    public String roleEmployee()
    {
        return prefix + "/roleEmployee";
    }

    /**
     * 查询(旧)账号角色关联列表
     */
    @RequiresPermissions("gps:roleEmployee:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(AccountRole accountRole)
    {
        startPage();
        List<AccountRole> list = accountRoleService.selectAccountRoleList(accountRole);
        return getDataTable(list);
    }

    /**
     * 导出(旧)账号角色关联列表
     */
    @RequiresPermissions("gps:roleEmployee:export")
    @Log(title = "(旧)账号角色关联", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(AccountRole accountRole)
    {
        List<AccountRole> list = accountRoleService.selectAccountRoleList(accountRole);
        ExcelUtil<AccountRole> util = new ExcelUtil<AccountRole>(AccountRole.class);
        return util.exportExcel(list, "(旧)账号角色关联数据");
    }

    /**
     * 新增(旧)账号角色关联
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存(旧)账号角色关联
     */
    @RequiresPermissions("gps:roleEmployee:add")
    @Log(title = "(旧)账号角色关联", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(AccountRole accountRole)
    {
        return toAjax(accountRoleService.insertAccountRole(accountRole));
    }

    /**
     * 修改(旧)账号角色关联
     */
    @RequiresPermissions("gps:roleEmployee:edit")
    @GetMapping("/edit/{accountRoleId}")
    public String edit(@PathVariable("accountRoleId") String accountRoleId, ModelMap mmap)
    {
        AccountRole accountRole = accountRoleService.selectAccountRoleByAccountRoleId(accountRoleId);
        mmap.put("accountRole", accountRole);
        return prefix + "/edit";
    }

    /**
     * 修改保存(旧)账号角色关联
     */
    @RequiresPermissions("gps:roleEmployee:edit")
    @Log(title = "(旧)账号角色关联", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(AccountRole accountRole)
    {
        return toAjax(accountRoleService.updateAccountRole(accountRole));
    }

    /**
     * 删除(旧)账号角色关联
     */
    @RequiresPermissions("gps:roleEmployee:remove")
    @Log(title = "(旧)账号角色关联", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(accountRoleService.deleteAccountRoleByAccountRoleIds(ids));
    }
}
