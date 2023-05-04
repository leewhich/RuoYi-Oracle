package com.kingyun.gpsinspection.service.impl;

import java.util.List;
import com.kingyun.common.utils.DateUtils;
import com.kingyun.gpsinspection.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kingyun.gpsinspection.mapper.EmployeeMapper;
import com.kingyun.gpsinspection.service.IEmployeeService;
import com.kingyun.common.core.text.Convert;

/**
 * (旧)员工信息Service业务层处理
 *
 * @author kingyun
 * @date 2023-04-28
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService
{
    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 查询(旧)员工信息
     *
     * @param employeeId (旧)员工信息主键
     * @return (旧)员工信息
     */
    @Override
    public Employee selectEmployeeByEmployeeId(String employeeId)
    {
        return employeeMapper.selectEmployeeByEmployeeId(employeeId);
    }

    /**
     * 查询(旧)员工信息列表
     *
     * @param employee (旧)员工信息
     * @return (旧)员工信息
     */
    @Override
    public List<Employee> selectEmployeeList(Employee employee)
    {
        return employeeMapper.selectEmployeeList(employee);
    }

    /**
     * 新增(旧)员工信息
     *
     * @param employee (旧)员工信息
     * @return 结果
     */
    @Override
    public int insertEmployee(Employee employee)
    {
        employee.setCreateTime(DateUtils.getNowDate());
        return employeeMapper.insertEmployee(employee);
    }

    /**
     * 修改(旧)员工信息
     *
     * @param employee (旧)员工信息
     * @return 结果
     */
    @Override
    public int updateEmployee(Employee employee)
    {
        return employeeMapper.updateEmployee(employee);
    }

    /**
     * 批量删除(旧)员工信息
     *
     * @param employeeIds 需要删除的(旧)员工信息主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeByEmployeeIds(String employeeIds)
    {
        return employeeMapper.deleteEmployeeByEmployeeIds(Convert.toStrArray(employeeIds));
    }

    /**
     * 删除(旧)员工信息信息
     *
     * @param employeeId (旧)员工信息主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeByEmployeeId(String employeeId)
    {
        return employeeMapper.deleteEmployeeByEmployeeId(employeeId);
    }
}
