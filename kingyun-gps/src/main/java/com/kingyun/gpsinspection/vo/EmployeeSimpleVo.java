package com.kingyun.gpsinspection.vo;

import java.io.Serializable;

/**
 * Created by YuPeng on 2016/12/1.
 */
public class EmployeeSimpleVo implements Serializable {

    private String employeeId;

    private String name;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
