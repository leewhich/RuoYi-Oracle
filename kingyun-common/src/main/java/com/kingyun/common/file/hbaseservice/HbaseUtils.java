package com.kingyun.common.file.hbaseservice;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.util.Bytes;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * Created by wangzhen on 2016/8/2.
 */
@Component
public class HbaseUtils implements InitializingBean {
    private String tableName;

    private byte[] tableNameAsBytes;

    @Resource(name = "HBaseConfig")
    private Configuration config;


    @Autowired(required = false)
    private HbaseRepository userRepository;

    private HBaseAdmin admin;

    /**
     * 初始化，没有表名时添加表名
     * @param tableName
     * @throws IOException
     */
    public void initialize(String tableName) throws IOException {
        this.tableName = tableName;
        userRepository.initialize(tableName);
        this.tableNameAsBytes = Bytes.toBytes(tableName);
        if ( ! admin.tableExists(tableNameAsBytes)) {
            HTableDescriptor tableDescriptor = new HTableDescriptor(tableName);
            HColumnDescriptor columnDescriptor = new HColumnDescriptor(HbaseRepository.F_PIC);
            tableDescriptor.addFamily(columnDescriptor);
            admin.createTable(tableDescriptor);
        }
    }

    public void addOrg(final String fileName, final byte[] pic ) {
        userRepository.save(fileName, pic);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        admin = new HBaseAdmin(config);
    }

    /**
     * 保存记录
     * @param fileName
     * @param pic
     */
    public void add(final String fileName, final byte[] pic ) {
        userRepository.save(fileName, pic);
    }
}
