package com.kingyun.web.controller.gps;

import java.util.List;

import com.kingyun.gpsinspection.domain.Employee;
import com.kingyun.gpsinspection.service.IEmployeeService;
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
import com.kingyun.common.core.controller.BaseController;
import com.kingyun.common.core.domain.AjaxResult;
import com.kingyun.common.utils.poi.ExcelUtil;
import com.kingyun.common.core.page.TableDataInfo;

/**
 * (旧)员工信息Controller
 *
 * @author kingyun
 * @date 2023-04-28
 */
@Controller
@RequestMapping("/gps/employee")
public class EmployeeController extends BaseController
{
    private String prefix = "gps/employee";

    @Autowired
    private IEmployeeService employeeService;

    @RequiresPermissions("gps:employee:view")
    @GetMapping()
    public String employee()
    {
        return prefix + "/employee";
    }

    /**
     * 查询(旧)员工信息列表
     */
    @RequiresPermissions("gps:employee:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Employee employee)
    {
        startPage();
        List<Employee> list = employeeService.selectEmployeeList(employee);
        return getDataTable(list);
    }

    /**
     * 导出(旧)员工信息列表
     */
    @RequiresPermissions("gps:employee:export")
    @Log(title = "(旧)员工信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Employee employee)
    {
        List<Employee> list = employeeService.selectEmployeeList(employee);
        ExcelUtil<Employee> util = new ExcelUtil<Employee>(Employee.class);
        return util.exportExcel(list, "(旧)员工信息数据");
    }

    /**
     * 新增(旧)员工信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存(旧)员工信息
     */
    @RequiresPermissions("gps:employee:add")
    @Log(title = "(旧)员工信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Employee employee)
    {
        return toAjax(employeeService.insertEmployee(employee));
    }

    /**
     * 修改(旧)员工信息
     */
    @RequiresPermissions("gps:employee:edit")
    @GetMapping("/edit/{employeeId}")
    public String edit(@PathVariable("employeeId") String employeeId, ModelMap mmap)
    {
        Employee employee = employeeService.selectEmployeeByEmployeeId(employeeId);
        mmap.put("employee", employee);
        return prefix + "/edit";
    }

    /**
     * 修改保存(旧)员工信息
     */
    @RequiresPermissions("gps:employee:edit")
    @Log(title = "(旧)员工信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Employee employee)
    {
        return toAjax(employeeService.updateEmployee(employee));
    }

    /**
     * 删除(旧)员工信息
     */
    @RequiresPermissions("gps:employee:remove")
    @Log(title = "(旧)员工信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(employeeService.deleteEmployeeByEmployeeIds(ids));
    }
}
