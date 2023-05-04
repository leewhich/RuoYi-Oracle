package com.kingyun.common.config.file;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * company 重庆泓宝科技股份有限公司
 * FileName HBaseConfig
 * Package com.kingyun.common.config.file
 * Description HBase配置
 * author liweiqi
 * create 2023-04-28 17:49
 * version V1.0
 */

@Component
@ConfigurationProperties(prefix = "hbase.zk")
@Data
public class HBaseConfig {
    String host;
    String port;
}
