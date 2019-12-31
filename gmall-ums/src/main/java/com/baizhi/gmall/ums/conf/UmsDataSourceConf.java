package com.baizhi.gmall.ums.conf;

import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

/*
*
* 使用ShardingJDBC完成 读写分离
*
*
* */


@Configuration
public class UmsDataSourceConf {


    @Bean
    public DataSource dataSource() throws IOException, SQLException {

        File file = ResourceUtils.getFile("classpath:sharding-jdbc.yml");
        DataSource dataSource = MasterSlaveDataSourceFactory .createDataSource(file);
        return dataSource;
    }
}
