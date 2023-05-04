package com.kingyun.common.file.hbaseservice;

import java.io.Serializable;

/**
 * 文件实体对象
 * Created by wangzhen on 2016/8/2.
 */
public class UploadFile implements Serializable
{
    private static final long serialVersionUID = 5581588695558217858L;
    private byte[] pic;

    private String fileName;

    public UploadFile() {
    }

    public UploadFile(String fileName, byte[] pic) {
        this.pic = pic;
        this.fileName = fileName;
    }

    public UploadFile(byte[] pic) {
        this.pic = pic;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
