package com.kingyun.gpsinspection.domain;

import com.kingyun.common.core.domain.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * 管线类别
 * created by lutianbo 2017/05/16
 */
public class PipeLineTypes extends BaseEntity implements Serializable {
    // 主键
    private String pipelineTypeId;
    // 类别名称
    private String typeName;
    // 颜色
    private String color;
    // 描述或者备注
    private String description;
    // 排序
    private Short sortCode;
    // 是否删除 0:否 1是
    private Short deleteMark;
    // 是否启用 0是 1否
    private Short enabledMark;
    // 创建时间
    private Date createTime;
    // 创建者id
    private String creatorUserId;
    // 最后修改时间
    private Date lastModifyTime;
    // 最后修改者id
    private String lastModifyUserId;
    // 删除时间
    private Date deleteTime;
    // 删除者id
    private String deleteUserId;

    public String getPipelineTypeId() {
        return pipelineTypeId;
    }

    public void setPipelineTypeId(String pipelineTypeId) {
        this.pipelineTypeId = pipelineTypeId == null ? null : pipelineTypeId.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Short getSortCode() {
        return sortCode;
    }

    public void setSortCode(Short sortCode) {
        this.sortCode = sortCode;
    }

    public Short getDeleteMark() {
        return deleteMark;
    }

    public void setDeleteMark(Short deleteMark) {
        this.deleteMark = deleteMark;
    }

    public Short getEnabledMark() {
        return enabledMark;
    }

    public void setEnabledMark(Short enabledMark) {
        this.enabledMark = enabledMark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId == null ? null : creatorUserId.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getLastModifyUserId() {
        return lastModifyUserId;
    }

    public void setLastModifyUserId(String lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId == null ? null : lastModifyUserId.trim();
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getDeleteUserId() {
        return deleteUserId;
    }

    public void setDeleteUserId(String deleteUserId) {
        this.deleteUserId = deleteUserId == null ? null : deleteUserId.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
