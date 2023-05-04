package com.kingyun.gpsinspection.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.kingyun.common.annotation.Excel;
import com.kingyun.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * (旧)组织机构对象 wwp_organization
 *
 * @author kingyun
 * @date 2023-04-28
 */
public class Organization extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 组织结构主键 */
    private String orgId;

    /** 组织名字 */
    @Excel(name = "组织名字")
    private String orgName;

    /** 层级代码，最顶层为001，每级3个字符表示父级组织ID */
    @Excel(name = "层级代码，最顶层为001，每级3个字符表示父级组织ID")
    private String parentOrgId;

    /** 组织机构负责人 */
    @Excel(name = "组织机构负责人")
    private String orgLeader;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 邮编 */
    @Excel(name = "邮编")
    private String postcode;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** 0：正常  1：停用 */
    @Excel(name = "0：正常  1：停用")
    private Integer status;

    /** 电话1 */
    @Excel(name = "电话1")
    private String tel1;

    /** 电话2 */
    @Excel(name = "电话2")
    private String tel2;

    /** 传真 */
    @Excel(name = "传真")
    private String fax;

    /** 创建人id */
    @Excel(name = "创建人id")
    private String creatorId;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDt;

    /** 操作人 */
    @Excel(name = "操作人")
    private String operateId;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date operateDt;

    /** 初始化 */
    @Excel(name = "初始化")
    private String initials;

    /** 序号 */
    @Excel(name = "序号")
    private Long orderNo;

    /** 是否真实 */
    @Excel(name = "是否真实")
    private String isVirtual;

    /** 标志 */
    @Excel(name = "标志")
    private Integer sysFlag;

    /** sysid */
    @Excel(name = "sysid")
    private String orgSysId;

    /** 父级id */
    @Excel(name = "父级id")
    private String orgParentId;

    /** 旧ID */
    @Excel(name = "旧ID")
    private String oldId;

    /** 旧编码 */
    @Excel(name = "旧编码")
    private String orgCode;

    /** 组织的类别包括单位、部门、分公司等 */
    @Excel(name = "组织的类别包括单位、部门、分公司等")
    private String orgType;

    /** 组织级别 */
    @Excel(name = "组织级别")
    private String orgLevel;

    /** bsflag */
    @Excel(name = "bsflag")
    private String bsflag;

    /** systemid */
    @Excel(name = "systemid")
    private String systemid;

    /** 精度 */
    @Excel(name = "精度")
    private String accuracy;

    /** 经度 */
    @Excel(name = "经度")
    private String latitude;

    /** is_autonomous */
    @Excel(name = "is_autonomous")
    private String isAutonomous;

    /** 1；分公司；2：气矿；3：作业区；4：一线场站站；5：井；6：管线 */
    @Excel(name = "1；分公司；2：气矿；3：作业区；4：一线场站站；5：井；6：管线")
    private String orgLevelId;

    /** is_peripheral */
    @Excel(name = "is_peripheral")
    private Integer isPeripheral;

    public void setOrgId(String orgId)
    {
        this.orgId = orgId;
    }

    public String getOrgId()
    {
        return orgId;
    }
    public void setOrgName(String orgName)
    {
        this.orgName = orgName;
    }

    public String getOrgName()
    {
        return orgName;
    }
    public void setParentOrgId(String parentOrgId)
    {
        this.parentOrgId = parentOrgId;
    }

    public String getParentOrgId()
    {
        return parentOrgId;
    }
    public void setOrgLeader(String orgLeader)
    {
        this.orgLeader = orgLeader;
    }

    public String getOrgLeader()
    {
        return orgLeader;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }
    public void setPostcode(String postcode)
    {
        this.postcode = postcode;
    }

    public String getPostcode()
    {
        return postcode;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
    public void setStatus(Integer status)
    {
        this.status = status;
    }

    public Integer getStatus()
    {
        return status;
    }
    public void setTel1(String tel1)
    {
        this.tel1 = tel1;
    }

    public String getTel1()
    {
        return tel1;
    }
    public void setTel2(String tel2)
    {
        this.tel2 = tel2;
    }

    public String getTel2()
    {
        return tel2;
    }
    public void setFax(String fax)
    {
        this.fax = fax;
    }

    public String getFax()
    {
        return fax;
    }
    public void setCreatorId(String creatorId)
    {
        this.creatorId = creatorId;
    }

    public String getCreatorId()
    {
        return creatorId;
    }
    public void setCreateDt(Date createDt)
    {
        this.createDt = createDt;
    }

    public Date getCreateDt()
    {
        return createDt;
    }
    public void setOperateId(String operateId)
    {
        this.operateId = operateId;
    }

    public String getOperateId()
    {
        return operateId;
    }
    public void setOperateDt(Date operateDt)
    {
        this.operateDt = operateDt;
    }

    public Date getOperateDt()
    {
        return operateDt;
    }
    public void setInitials(String initials)
    {
        this.initials = initials;
    }

    public String getInitials()
    {
        return initials;
    }
    public void setOrderNo(Long orderNo)
    {
        this.orderNo = orderNo;
    }

    public Long getOrderNo()
    {
        return orderNo;
    }
    public void setIsVirtual(String isVirtual)
    {
        this.isVirtual = isVirtual;
    }

    public String getIsVirtual()
    {
        return isVirtual;
    }
    public void setSysFlag(Integer sysFlag)
    {
        this.sysFlag = sysFlag;
    }

    public Integer getSysFlag()
    {
        return sysFlag;
    }
    public void setOrgSysId(String orgSysId)
    {
        this.orgSysId = orgSysId;
    }

    public String getOrgSysId()
    {
        return orgSysId;
    }
    public void setOrgParentId(String orgParentId)
    {
        this.orgParentId = orgParentId;
    }

    public String getOrgParentId()
    {
        return orgParentId;
    }
    public void setOldId(String oldId)
    {
        this.oldId = oldId;
    }

    public String getOldId()
    {
        return oldId;
    }
    public void setOrgCode(String orgCode)
    {
        this.orgCode = orgCode;
    }

    public String getOrgCode()
    {
        return orgCode;
    }
    public void setOrgType(String orgType)
    {
        this.orgType = orgType;
    }

    public String getOrgType()
    {
        return orgType;
    }
    public void setOrgLevel(String orgLevel)
    {
        this.orgLevel = orgLevel;
    }

    public String getOrgLevel()
    {
        return orgLevel;
    }
    public void setBsflag(String bsflag)
    {
        this.bsflag = bsflag;
    }

    public String getBsflag()
    {
        return bsflag;
    }
    public void setSystemid(String systemid)
    {
        this.systemid = systemid;
    }

    public String getSystemid()
    {
        return systemid;
    }
    public void setAccuracy(String accuracy)
    {
        this.accuracy = accuracy;
    }

    public String getAccuracy()
    {
        return accuracy;
    }
    public void setLatitude(String latitude)
    {
        this.latitude = latitude;
    }

    public String getLatitude()
    {
        return latitude;
    }
    public void setIsAutonomous(String isAutonomous)
    {
        this.isAutonomous = isAutonomous;
    }

    public String getIsAutonomous()
    {
        return isAutonomous;
    }
    public void setOrgLevelId(String orgLevelId)
    {
        this.orgLevelId = orgLevelId;
    }

    public String getOrgLevelId()
    {
        return orgLevelId;
    }
    public void setIsPeripheral(Integer isPeripheral)
    {
        this.isPeripheral = isPeripheral;
    }

    public Integer getIsPeripheral()
    {
        return isPeripheral;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("orgId", getOrgId())
            .append("orgName", getOrgName())
            .append("parentOrgId", getParentOrgId())
            .append("orgLeader", getOrgLeader())
            .append("address", getAddress())
            .append("postcode", getPostcode())
            .append("description", getDescription())
            .append("status", getStatus())
            .append("tel1", getTel1())
            .append("tel2", getTel2())
            .append("fax", getFax())
            .append("creatorId", getCreatorId())
            .append("createDt", getCreateDt())
            .append("operateId", getOperateId())
            .append("operateDt", getOperateDt())
            .append("initials", getInitials())
            .append("orderNo", getOrderNo())
            .append("isVirtual", getIsVirtual())
            .append("sysFlag", getSysFlag())
            .append("orgSysId", getOrgSysId())
            .append("orgParentId", getOrgParentId())
            .append("oldId", getOldId())
            .append("orgCode", getOrgCode())
            .append("orgType", getOrgType())
            .append("orgLevel", getOrgLevel())
            .append("bsflag", getBsflag())
            .append("systemid", getSystemid())
            .append("accuracy", getAccuracy())
            .append("latitude", getLatitude())
            .append("isAutonomous", getIsAutonomous())
            .append("orgLevelId", getOrgLevelId())
            .append("isPeripheral", getIsPeripheral())
            .toString();
    }
}
