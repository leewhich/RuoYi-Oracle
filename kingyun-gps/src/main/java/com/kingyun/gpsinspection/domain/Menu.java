package com.kingyun.gpsinspection.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.kingyun.common.annotation.Excel;
import com.kingyun.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * (旧)菜单表对象 wwp_menu
 *
 * @author kingyun
 * @date 2023-04-28
 */
public class Menu extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 菜单id */
    private String menuId;

    /** 菜单名称 */
    @Excel(name = "菜单名称")
    private String menuName;

    /** 菜单风格 */
    @Excel(name = "菜单风格")
    private String menuStyle;

    /** 系统模块id */
    @Excel(name = "系统模块id")
    private String systemPlatformId;

    /** 权限标志 */
    @Excel(name = "权限标志")
    private String modulesPermission;

    /** 地址 */
    @Excel(name = "地址")
    private String url;

    /** 序号 */
    @Excel(name = "序号")
    private Integer menuOrder;

    /** 菜单编码 */
    @Excel(name = "菜单编码")
    private String menuCode;

    /** 图片地址 */
    @Excel(name = "图片地址")
    private String imgPath;

    /** impl_class */
    @Excel(name = "impl_class")
    private String implClass;

    /** prie_calss */
    @Excel(name = "prie_calss")
    private String prieCalss;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String systemId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long status;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String parentMenuId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String remark1;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String remark2;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String creator;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date createDate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String modifier;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date modifyDate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String menuType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String appId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long orderNo;

    public void setMenuId(String menuId)
    {
        this.menuId = menuId;
    }

    public String getMenuId()
    {
        return menuId;
    }
    public void setMenuName(String menuName)
    {
        this.menuName = menuName;
    }

    public String getMenuName()
    {
        return menuName;
    }
    public void setMenuStyle(String menuStyle)
    {
        this.menuStyle = menuStyle;
    }

    public String getMenuStyle()
    {
        return menuStyle;
    }
    public void setSystemPlatformId(String systemPlatformId)
    {
        this.systemPlatformId = systemPlatformId;
    }

    public String getSystemPlatformId()
    {
        return systemPlatformId;
    }
    public void setModulesPermission(String modulesPermission)
    {
        this.modulesPermission = modulesPermission;
    }

    public String getModulesPermission()
    {
        return modulesPermission;
    }
    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getUrl()
    {
        return url;
    }
    public void setMenuOrder(Integer menuOrder)
    {
        this.menuOrder = menuOrder;
    }

    public Integer getMenuOrder()
    {
        return menuOrder;
    }
    public void setMenuCode(String menuCode)
    {
        this.menuCode = menuCode;
    }

    public String getMenuCode()
    {
        return menuCode;
    }
    public void setImgPath(String imgPath)
    {
        this.imgPath = imgPath;
    }

    public String getImgPath()
    {
        return imgPath;
    }
    public void setImplClass(String implClass)
    {
        this.implClass = implClass;
    }

    public String getImplClass()
    {
        return implClass;
    }
    public void setPrieCalss(String prieCalss)
    {
        this.prieCalss = prieCalss;
    }

    public String getPrieCalss()
    {
        return prieCalss;
    }
    public void setSystemId(String systemId)
    {
        this.systemId = systemId;
    }

    public String getSystemId()
    {
        return systemId;
    }
    public void setStatus(Long status)
    {
        this.status = status;
    }

    public Long getStatus()
    {
        return status;
    }
    public void setParentMenuId(String parentMenuId)
    {
        this.parentMenuId = parentMenuId;
    }

    public String getParentMenuId()
    {
        return parentMenuId;
    }
    public void setRemark1(String remark1)
    {
        this.remark1 = remark1;
    }

    public String getRemark1()
    {
        return remark1;
    }
    public void setRemark2(String remark2)
    {
        this.remark2 = remark2;
    }

    public String getRemark2()
    {
        return remark2;
    }
    public void setCreator(String creator)
    {
        this.creator = creator;
    }

    public String getCreator()
    {
        return creator;
    }
    public void setCreateDate(Date createDate)
    {
        this.createDate = createDate;
    }

    public Date getCreateDate()
    {
        return createDate;
    }
    public void setModifier(String modifier)
    {
        this.modifier = modifier;
    }

    public String getModifier()
    {
        return modifier;
    }
    public void setModifyDate(Date modifyDate)
    {
        this.modifyDate = modifyDate;
    }

    public Date getModifyDate()
    {
        return modifyDate;
    }
    public void setMenuType(String menuType)
    {
        this.menuType = menuType;
    }

    public String getMenuType()
    {
        return menuType;
    }
    public void setAppId(String appId)
    {
        this.appId = appId;
    }

    public String getAppId()
    {
        return appId;
    }
    public void setOrderNo(Long orderNo)
    {
        this.orderNo = orderNo;
    }

    public Long getOrderNo()
    {
        return orderNo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("menuId", getMenuId())
            .append("menuName", getMenuName())
            .append("menuStyle", getMenuStyle())
            .append("systemPlatformId", getSystemPlatformId())
            .append("modulesPermission", getModulesPermission())
            .append("url", getUrl())
            .append("menuOrder", getMenuOrder())
            .append("menuCode", getMenuCode())
            .append("imgPath", getImgPath())
            .append("remark", getRemark())
            .append("implClass", getImplClass())
            .append("prieCalss", getPrieCalss())
            .append("systemId", getSystemId())
            .append("status", getStatus())
            .append("parentMenuId", getParentMenuId())
            .append("remark1", getRemark1())
            .append("remark2", getRemark2())
            .append("creator", getCreator())
            .append("createDate", getCreateDate())
            .append("modifier", getModifier())
            .append("modifyDate", getModifyDate())
            .append("menuType", getMenuType())
            .append("appId", getAppId())
            .append("orderNo", getOrderNo())
            .toString();
    }
}
