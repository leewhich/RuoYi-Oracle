package com.kingyun.gpsinspection.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.kingyun.common.annotation.Excel;
import com.kingyun.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * （旧）角色资源对象 wwp_role_menu
 *
 * @author kingyun
 * @date 2023-04-28
 */
public class RoleMenu extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 角色菜单id */
    private String roleMenuId;

    /** 角色id */
    @Excel(name = "角色id")
    private String roleId;

    /** 菜单id */
    @Excel(name = "菜单id")
    private String menuId;

    /** 状态 */
    @Excel(name = "状态")
    private Integer state;

    /** 子系统id */
    @Excel(name = "子系统id")
    private String subsystem;

    /** 创建用户id */
    @Excel(name = "创建用户id")
    private String creator;

    /** 修改人 */
    @Excel(name = "修改人")
    private String modifyer;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date modifytime;

    public void setRoleMenuId(String roleMenuId)
    {
        this.roleMenuId = roleMenuId;
    }

    public String getRoleMenuId()
    {
        return roleMenuId;
    }
    public void setRoleId(String roleId)
    {
        this.roleId = roleId;
    }

    public String getRoleId()
    {
        return roleId;
    }
    public void setMenuId(String menuId)
    {
        this.menuId = menuId;
    }

    public String getMenuId()
    {
        return menuId;
    }
    public void setState(Integer state)
    {
        this.state = state;
    }

    public Integer getState()
    {
        return state;
    }
    public void setSubsystem(String subsystem)
    {
        this.subsystem = subsystem;
    }

    public String getSubsystem()
    {
        return subsystem;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("roleMenuId", getRoleMenuId())
            .append("roleId", getRoleId())
            .append("menuId", getMenuId())
            .append("state", getState())
            .append("subsystem", getSubsystem())
            .append("creator", getCreator())
            .append("createtime", getCreateTime())
            .append("modifyer", getModifyer())
            .append("modifytime", getModifytime())
            .toString();
    }
}
