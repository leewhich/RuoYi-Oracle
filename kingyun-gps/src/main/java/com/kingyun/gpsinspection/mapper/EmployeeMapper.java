package com.kingyun.gpsinspection.mapper;

import java.util.List;
import com.kingyun.gpsinspection.domain.Employee;

/**
 * (旧)员工信息Mapper接口
 * 
 * @author kingyun
 * @date 2023-04-28
 */
public interface EmployeeMapper 
{
    /**
     * 查询(旧)员工信息
     * 
     * @param employeeId (旧)员工信息主键
     * @return (旧)员工信息
     */
    public Employee selectEmployeeByEmployeeId(String employeeId);

    /**
     * 查询(旧)员工信息列表
     * 
     * @param employee (旧)员工信息
     * @return (旧)员工信息集合
     */
    public List<Employee> selectEmployeeList(Employee employee);

    /**
     * 新增(旧)员工信息
     * 
     * @param employee (旧)员工信息
     * @return 结果
     */
    public int insertEmployee(Employee employee);

    /**
     * 修改(旧)员工信息
     * 
     * @param employee (旧)员工信息
     * @return 结果
     */
    public int updateEmployee(Employee employee);

    /**
     * 删除(旧)员工信息
     * 
     * @param employeeId (旧)员工信息主键
     * @return 结果
     */
    public int deleteEmployeeByEmployeeId(String employeeId);

    /**
     * 批量删除(旧)员工信息
     * 
     * @param employeeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEmployeeByEmployeeIds(String[] employeeIds);
}
