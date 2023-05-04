package com.kingyun.gpsinspection.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.kingyun.common.annotation.Excel;
import com.kingyun.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * (旧)员工信息对象 wwp_employee
 *
 * @author kingyun
 * @date 2023-04-28
 */
public class Employee extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 员工ID */
    private String employeeId;

    /** 职位id */
    @Excel(name = "职位id")
    private String postId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 0：男  1：女 */
    @Excel(name = "0：男  1：女")
    private Integer sex;

    /** 操作人id */
    @Excel(name = "操作人id")
    private String operatorId;

    /** 员工工号 */
    @Excel(name = "员工工号")
    private String workNumber;

    /** 入职时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入职时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date enrollDate;

    /** 生日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 工卡ID */
    @Excel(name = "工卡ID")
    private String cardId;

    /** 员工照片内部编码yyyymmddhh24miss+4位随机数 */
    @Excel(name = "员工照片内部编码yyyymmddhh24miss+4位随机数")
    private String portraitCode;

    /** 手机号 */
    @Excel(name = "手机号")
    private String mobilePhone;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String officeTel;

    /** 家庭住址 */
    @Excel(name = "家庭住址")
    private String address;

    /** 邮编 */
    @Excel(name = "邮编")
    private String postcode;

    /** qq号 */
    @Excel(name = "qq号")
    private String qqid;

    /** 电子邮箱地址 */
    @Excel(name = "电子邮箱地址")
    private String email;

    /** 联系人 */
    @Excel(name = "联系人")
    private String emgContactPerson;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String emgContactTel;

    /** 备注 */
    @Excel(name = "备注")
    private String description;

    /** 0：正常1：删除 */
    @Excel(name = "0：正常1：删除")
    private Integer status;

    /** 创建人账号ID */
    @Excel(name = "创建人账号ID")
    private String creatorId;

    /** 修改人id */
    @Excel(name = "修改人id")
    private String modifierId;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date modifyTime;

    /** 登录账号 */
    @Excel(name = "登录账号")
    private String loginId;

    /** 密码 */
    @Excel(name = "密码")
    private String password;

    /** bsflag */
    @Excel(name = "bsflag")
    private String bsflag;

    /** 语言 */
    @Excel(name = "语言")
    private String language;

    /** skin_name */
    @Excel(name = "skin_name")
    private String skinName;

    /** domain_type */
    @Excel(name = "domain_type")
    private String domainType;

    /** 用户类型 */
    @Excel(name = "用户类型")
    private String userType;

    /** 最近一次登录时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最近一次登录时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastLoginTime;

    /** 当前登录时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "当前登录时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date thisLoginTime;

    /** 登录ip */
    @Excel(name = "登录ip")
    private String loginIp;

    /** token */
    @Excel(name = "token")
    private String token;

    /** 部门id */
    @Excel(name = "部门id")
    private String depId;

    /** 组织id */
    @Excel(name = "组织id")
    private String orgId;

    /** 工作地点id */
    @Excel(name = "工作地点id")
    private String workSpeciesId;

    /** is_peripheral */
    @Excel(name = "is_peripheral")
    private Integer isPeripheral;

    /** eng_detail_id */
    @Excel(name = "eng_detail_id")
    private String engDetailId;

    /** 是否删除0未删除1已删除 */
    @Excel(name = "是否删除0未删除1已删除")
    private Integer enableMark;

    public void setEmployeeId(String employeeId)
    {
        this.employeeId = employeeId;
    }

    public String getEmployeeId()
    {
        return employeeId;
    }
    public void setPostId(String postId)
    {
        this.postId = postId;
    }

    public String getPostId()
    {
        return postId;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setSex(Integer sex)
    {
        this.sex = sex;
    }

    public Integer getSex()
    {
        return sex;
    }
    public void setOperatorId(String operatorId)
    {
        this.operatorId = operatorId;
    }

    public String getOperatorId()
    {
        return operatorId;
    }
    public void setWorkNumber(String workNumber)
    {
        this.workNumber = workNumber;
    }

    public String getWorkNumber()
    {
        return workNumber;
    }
    public void setEnrollDate(Date enrollDate)
    {
        this.enrollDate = enrollDate;
    }

    public Date getEnrollDate()
    {
        return enrollDate;
    }
    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public Date getBirthday()
    {
        return birthday;
    }
    public void setCardId(String cardId)
    {
        this.cardId = cardId;
    }

    public String getCardId()
    {
        return cardId;
    }
    public void setPortraitCode(String portraitCode)
    {
        this.portraitCode = portraitCode;
    }

    public String getPortraitCode()
    {
        return portraitCode;
    }
    public void setMobilePhone(String mobilePhone)
    {
        this.mobilePhone = mobilePhone;
    }

    public String getMobilePhone()
    {
        return mobilePhone;
    }
    public void setOfficeTel(String officeTel)
    {
        this.officeTel = officeTel;
    }

    public String getOfficeTel()
    {
        return officeTel;
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
    public void setQqid(String qqid)
    {
        this.qqid = qqid;
    }

    public String getQqid()
    {
        return qqid;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmgContactPerson(String emgContactPerson)
    {
        this.emgContactPerson = emgContactPerson;
    }

    public String getEmgContactPerson()
    {
        return emgContactPerson;
    }
    public void setEmgContactTel(String emgContactTel)
    {
        this.emgContactTel = emgContactTel;
    }

    public String getEmgContactTel()
    {
        return emgContactTel;
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
    public void setCreatorId(String creatorId)
    {
        this.creatorId = creatorId;
    }

    public String getCreatorId()
    {
        return creatorId;
    }
    public void setModifierId(String modifierId)
    {
        this.modifierId = modifierId;
    }

    public String getModifierId()
    {
        return modifierId;
    }
    public void setModifyTime(Date modifyTime)
    {
        this.modifyTime = modifyTime;
    }

    public Date getModifyTime()
    {
        return modifyTime;
    }
    public void setLoginId(String loginId)
    {
        this.loginId = loginId;
    }

    public String getLoginId()
    {
        return loginId;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword()
    {
        return password;
    }
    public void setBsflag(String bsflag)
    {
        this.bsflag = bsflag;
    }

    public String getBsflag()
    {
        return bsflag;
    }
    public void setLanguage(String language)
    {
        this.language = language;
    }

    public String getLanguage()
    {
        return language;
    }
    public void setSkinName(String skinName)
    {
        this.skinName = skinName;
    }

    public String getSkinName()
    {
        return skinName;
    }
    public void setDomainType(String domainType)
    {
        this.domainType = domainType;
    }

    public String getDomainType()
    {
        return domainType;
    }
    public void setUserType(String userType)
    {
        this.userType = userType;
    }

    public String getUserType()
    {
        return userType;
    }
    public void setLastLoginTime(Date lastLoginTime)
    {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getLastLoginTime()
    {
        return lastLoginTime;
    }
    public void setThisLoginTime(Date thisLoginTime)
    {
        this.thisLoginTime = thisLoginTime;
    }

    public Date getThisLoginTime()
    {
        return thisLoginTime;
    }
    public void setLoginIp(String loginIp)
    {
        this.loginIp = loginIp;
    }

    public String getLoginIp()
    {
        return loginIp;
    }
    public void setToken(String token)
    {
        this.token = token;
    }

    public String getToken()
    {
        return token;
    }
    public void setDepId(String depId)
    {
        this.depId = depId;
    }

    public String getDepId()
    {
        return depId;
    }
    public void setOrgId(String orgId)
    {
        this.orgId = orgId;
    }

    public String getOrgId()
    {
        return orgId;
    }
    public void setWorkSpeciesId(String workSpeciesId)
    {
        this.workSpeciesId = workSpeciesId;
    }

    public String getWorkSpeciesId()
    {
        return workSpeciesId;
    }
    public void setIsPeripheral(Integer isPeripheral)
    {
        this.isPeripheral = isPeripheral;
    }

    public Integer getIsPeripheral()
    {
        return isPeripheral;
    }
    public void setEngDetailId(String engDetailId)
    {
        this.engDetailId = engDetailId;
    }

    public String getEngDetailId()
    {
        return engDetailId;
    }
    public void setEnableMark(Integer enableMark)
    {
        this.enableMark = enableMark;
    }

    public Integer getEnableMark()
    {
        return enableMark;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("employeeId", getEmployeeId())
            .append("postId", getPostId())
            .append("name", getName())
            .append("sex", getSex())
            .append("operatorId", getOperatorId())
            .append("workNumber", getWorkNumber())
            .append("enrollDate", getEnrollDate())
            .append("birthday", getBirthday())
            .append("cardId", getCardId())
            .append("portraitCode", getPortraitCode())
            .append("mobilePhone", getMobilePhone())
            .append("officeTel", getOfficeTel())
            .append("address", getAddress())
            .append("postcode", getPostcode())
            .append("qqid", getQqid())
            .append("email", getEmail())
            .append("emgContactPerson", getEmgContactPerson())
            .append("emgContactTel", getEmgContactTel())
            .append("description", getDescription())
            .append("status", getStatus())
            .append("creatorId", getCreatorId())
            .append("createTime", getCreateTime())
            .append("modifierId", getModifierId())
            .append("modifyTime", getModifyTime())
            .append("loginId", getLoginId())
            .append("password", getPassword())
            .append("bsflag", getBsflag())
            .append("language", getLanguage())
            .append("skinName", getSkinName())
            .append("domainType", getDomainType())
            .append("userType", getUserType())
            .append("lastLoginTime", getLastLoginTime())
            .append("thisLoginTime", getThisLoginTime())
            .append("loginIp", getLoginIp())
            .append("token", getToken())
            .append("depId", getDepId())
            .append("orgId", getOrgId())
            .append("workSpeciesId", getWorkSpeciesId())
            .append("isPeripheral", getIsPeripheral())
            .append("engDetailId", getEngDetailId())
            .append("enableMark", getEnableMark())
            .toString();
    }
}
