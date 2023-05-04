package com.kingyun.gpsinspection.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrgLevel implements Serializable
{
    private String orgLevelId;

    private String orgLevelName;

    private BigDecimal orgLevel;

    private String parentTypeId;

    private BigDecimal orgType;

    private String description;

    private BigDecimal state;

    public String getOrgLevelId() {
        return orgLevelId;
    }

    public void setOrgLevelId(String orgLevelId) {
        this.orgLevelId = orgLevelId;
    }

    public String getOrgLevelName() {
        return orgLevelName;
    }

    public void setOrgLevelName(String orgLevelName) {
        this.orgLevelName = orgLevelName == null ? null : orgLevelName.trim();
    }

    public BigDecimal getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(BigDecimal orgLevel) {
        this.orgLevel = orgLevel;
    }

    public String getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public BigDecimal getOrgType() {
        return orgType;
    }

    public void setOrgType(BigDecimal orgType) {
        this.orgType = orgType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getState() {
        return state;
    }

    public void setState(BigDecimal state) {
        this.state = state;
    }
}
