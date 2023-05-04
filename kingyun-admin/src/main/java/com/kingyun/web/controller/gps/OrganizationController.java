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
import com.kingyun.gpsinspection.domain.Organization;
import com.kingyun.gpsinspection.service.IOrganizationService;
import com.kingyun.common.core.controller.BaseController;
import com.kingyun.common.core.domain.AjaxResult;
import com.kingyun.common.utils.poi.ExcelUtil;
import com.kingyun.common.core.page.TableDataInfo;

/**
 * (旧)组织机构Controller
 *
 * @author kingyun
 * @date 2023-04-28
 */
@Controller
@RequestMapping("/gps/organization")
public class OrganizationController extends BaseController
{
    private String prefix = "gps/organization";

    @Autowired
    private IOrganizationService organizationService;

    @RequiresPermissions("gps:organization:view")
    @GetMapping()
    public String organization()
    {
        return prefix + "/organization";
    }

    /**
     * 查询(旧)组织机构列表
     */
    @RequiresPermissions("gps:organization:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Organization organization)
    {
        startPage();
        List<Organization> list = organizationService.selectOrganizationList(organization);
        return getDataTable(list);
    }

    /**
     * 导出(旧)组织机构列表
     */
    @RequiresPermissions("gps:organization:export")
    @Log(title = "(旧)组织机构", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Organization organization)
    {
        List<Organization> list = organizationService.selectOrganizationList(organization);
        ExcelUtil<Organization> util = new ExcelUtil<Organization>(Organization.class);
        return util.exportExcel(list, "(旧)组织机构数据");
    }

    /**
     * 新增(旧)组织机构
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存(旧)组织机构
     */
    @RequiresPermissions("gps:organization:add")
    @Log(title = "(旧)组织机构", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Organization organization)
    {
        return toAjax(organizationService.insertOrganization(organization));
    }

    /**
     * 修改(旧)组织机构
     */
    @RequiresPermissions("gps:organization:edit")
    @GetMapping("/edit/{orgId}")
    public String edit(@PathVariable("orgId") String orgId, ModelMap mmap)
    {
        Organization organization = organizationService.selectOrganizationByOrgId(orgId);
        mmap.put("organization", organization);
        return prefix + "/edit";
    }

    /**
     * 修改保存(旧)组织机构
     */
    @RequiresPermissions("gps:organization:edit")
    @Log(title = "(旧)组织机构", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Organization organization)
    {
        return toAjax(organizationService.updateOrganization(organization));
    }

    /**
     * 删除(旧)组织机构
     */
    @RequiresPermissions("gps:organization:remove")
    @Log(title = "(旧)组织机构", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(organizationService.deleteOrganizationByOrgIds(ids));
    }
}
