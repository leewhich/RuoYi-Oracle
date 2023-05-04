package com.kingyun.gpsinspection.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.kingyun.common.annotation.Excel;
import com.kingyun.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * (旧)角色管理对象 wwp_roles
 *
 * @author kingyun
 * @date 2023-04-28
 */
public class Roles extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 角色id */
    private String roleId;

    /** 角色名称 */
    @Excel(name = "角色名称")
    private String roleName;

    /** 角色描述 */
    @Excel(name = "角色描述")
    private String roleDesc;

    /** 父级角色id */
    @Excel(name = "父级角色id")
    private String parentRoleId;

    /** 1;应用角色；2流程角色 */
    @Excel(name = "1;应用角色；2流程角色")
    private Integer roleType;

    /** 参见操作员-系统平台表 */
    @Excel(name = "参见操作员-系统平台表")
    private String systemCode;

    /** 1可见2不可见 */
    @Excel(name = "1可见2不可见")
    private Integer state;

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

    /** 超级0，管理员1-5，其他6-9 */
    @Excel(name = "超级0，管理员1-5，其他6-9")
    private String roleLevel;

    /** memo */
    @Excel(name = "memo")
    private String memo;

    /** 组织ID */
    @Excel(name = "组织ID")
    private String orgId;

    public void setRoleId(String roleId)
    {
        this.roleId = roleId;
    }

    public String getRoleId()
    {
        return roleId;
    }
    public void setRoleName(String roleName)
    {
        this.roleName = roleName;
    }

    public String getRoleName()
    {
        return roleName;
    }
    public void setRoleDesc(String roleDesc)
    {
        this.roleDesc = roleDesc;
    }

    public String getRoleDesc()
    {
        return roleDesc;
    }
    public void setParentRoleId(String parentRoleId)
    {
        this.parentRoleId = parentRoleId;
    }

    public String getParentRoleId()
    {
        return parentRoleId;
    }
    public void setRoleType(Integer roleType)
    {
        this.roleType = roleType;
    }

    public Integer getRoleType()
    {
        return roleType;
    }
    public void setSystemCode(String systemCode)
    {
        this.systemCode = systemCode;
    }

    public String getSystemCode()
    {
        return systemCode;
    }
    public void setState(Integer state)
    {
        this.state = state;
    }

    public Integer getState()
    {
        return state;
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
    public void setRoleLevel(String roleLevel)
    {
        this.roleLevel = roleLevel;
    }

    public String getRoleLevel()
    {
        return roleLevel;
    }
    public void setMemo(String memo)
    {
        this.memo = memo;
    }

    public String getMemo()
    {
        return memo;
    }
    public void setOrgId(String orgId)
    {
        this.orgId = orgId;
    }

    public String getOrgId()
    {
        return orgId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("roleId", getRoleId())
            .append("roleName", getRoleName())
            .append("roleDesc", getRoleDesc())
            .append("parentRoleId", getParentRoleId())
            .append("roleType", getRoleType())
            .append("systemCode", getSystemCode())
            .append("state", getState())
            .append("creator", getCreator())
            .append("createtime", getCreateTime())
            .append("modifyer", getModifyer())
            .append("modifytime", getModifytime())
            .append("roleLevel", getRoleLevel())
            .append("memo", getMemo())
            .append("orgId", getOrgId())
            .toString();
    }
}
