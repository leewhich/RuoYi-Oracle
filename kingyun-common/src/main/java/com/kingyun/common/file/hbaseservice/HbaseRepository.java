package com.kingyun.common.file.hbaseservice;

import org.apache.hadoop.hbase.client.HTableInterface;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.hadoop.hbase.HbaseTemplate;
import org.springframework.data.hadoop.hbase.RowMapper;
import org.springframework.data.hadoop.hbase.TableCallback;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by wangzhen on 2016/8/2.
 */
@Repository
public class HbaseRepository {


    @Autowired(required = false)
    private HbaseTemplate hbaseTemplate;

    //表名
    private String tableName;

    //family列族名
    public static byte[] F_PIC = Bytes.toBytes("fPic");

    //qualifier列名
    private byte[] qPic = Bytes.toBytes("qPic");

    /**
     * 初始化
     * @param tableName
     */
    public void initialize(String tableName){
        this.tableName = tableName;
    }

    public List<UploadFile> findAll() {
        return hbaseTemplate.find(tableName, "fPic", new RowMapper<UploadFile>() {
            @Override
            public UploadFile mapRow(Result result, int rowNum) throws Exception {
                return new UploadFile(result.getValue(F_PIC, qPic));
            }
        });

    }

    public UploadFile save(final String fileName, final byte[] pic) {
        System.out.print("tableName;"+tableName);
        return hbaseTemplate.execute(tableName, new TableCallback<UploadFile>() {
            public UploadFile doInTable(HTableInterface table) throws Throwable {
                UploadFile img = new UploadFile(fileName, pic);
                Put p = new Put(Bytes.toBytes(img.getFileName()));
                p.add(F_PIC, qPic, img.getPic());
                table.put(p);
                return img;
            }
        });
    }

    public UploadFile get(final String fileName) {

        return hbaseTemplate.get(tableName,fileName,"fPic","qPic",new RowMapper<UploadFile>(){
            public UploadFile mapRow(Result result, int rowNum) throws Exception {
                return new UploadFile(result.getValue(F_PIC, qPic));
            }
        });

    }
}
