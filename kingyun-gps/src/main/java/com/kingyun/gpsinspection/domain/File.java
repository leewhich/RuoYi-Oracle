package com.kingyun.gpsinspection.domain;

import java.io.Serializable;

public class File implements Serializable {
    private static final long serialVersionUID = -5074155782580105708L;

    private String fileId;

    private String businessId;

    private String fileName;

    private Short fileType;

    private String fileHbasePath;

    private String ext;

    private String trait;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Short getFileType() {
        return fileType;
    }

    public void setFileType(Short fileType) {
        this.fileType = fileType;
    }

    public String getFileHbasePath() {
        return fileHbasePath;
    }

    public void setFileHbasePath(String fileHbasePath) {
        this.fileHbasePath = fileHbasePath == null ? null : fileHbasePath.trim();
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getTrait() {
        return trait;
    }

    public void setTrait(String trait) {
        this.trait = trait;
    }
}
