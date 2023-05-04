package com.kingyun.gpsinspection.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.kingyun.common.annotation.Excel;
import com.kingyun.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * (旧)账号角色关联对象 wwp_account_role
 *
 * @author kingyun
 * @date 2023-04-28
 */
public class AccountRole extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户角色id */
    private String accountRoleId;

    /** 角色id */
    @Excel(name = "角色id")
    private String roleId;

    /** 用户id */
    @Excel(name = "用户id")
    private String operatorId;

    /** 状态 */
    @Excel(name = "状态")
    private Integer status;

    /** 创建人 */
    @Excel(name = "创建人")
    private String creator;

    /** 修改人 */
    @Excel(name = "修改人")
    private String modifyer;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date modifytime;

    /** 组织di */
    @Excel(name = "组织di")
    private String orgId;

    /** subsystem */
    @Excel(name = "subsystem")
    private String subsystem;

    public void setAccountRoleId(String accountRoleId)
    {
        this.accountRoleId = accountRoleId;
    }

    public String getAccountRoleId()
    {
        return accountRoleId;
    }
    public void setRoleId(String roleId)
    {
        this.roleId = roleId;
    }

    public String getRoleId()
    {
        return roleId;
    }
    public void setOperatorId(String operatorId)
    {
        this.operatorId = operatorId;
    }

    public String getOperatorId()
    {
        return operatorId;
    }
    public void setStatus(Integer status)
    {
        this.status = status;
    }

    public Integer getStatus()
    {
        return status;
    }
    public void setCreator(String creator)
    {
        this.creator = creator;
    }

    public String getCreator()
    {
        return creator;
    }
    public void setModifyer(String modifyer)
    {
        this.modifyer = modifyer;
    }

    public String getModifyer()
    {
        return modifyer;
    }
    public void setModifytime(Date modifytime)
    {
        this.modifytime = modifytime;
    }

    public Date getModifytime()
    {
        return modifytime;
    }
    public void setOrgId(String orgId)
    {
        this.orgId = orgId;
    }

    public String getOrgId()
    {
        return orgId;
    }
    public void setSubsystem(String subsystem)
    {
        this.subsystem = subsystem;
    }

    public String getSubsystem()
    {
        return subsystem;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("accountRoleId", getAccountRoleId())
            .append("roleId", getRoleId())
            .append("operatorId", getOperatorId())
            .append("status", getStatus())
            .append("creator", getCreator())
            .append("createtime", getCreateTime())
            .append("modifyer", getModifyer())
            .append("modifytime", getModifytime())
            .append("orgId", getOrgId())
            .append("subsystem", getSubsystem())
            .toString();
    }
}
