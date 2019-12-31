package com.baizhi.gmall.ums;

import com.baizhi.gmall.ums.entity.Admin;
import com.baizhi.gmall.ums.mapper.AdminMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

@SpringBootTest
class GmallUmsApplicationTests {

    @Autowired
    AdminMapper adminMapper;


    @Test
    void contextLoads() {
        String md5password = DigestUtils.md5DigestAsHex("123456".getBytes());

        QueryWrapper<Admin> adminQueryWrapper = new QueryWrapper<Admin>().eq("username", "admin").eq("password", md5password);
        Admin admin = adminMapper.selectOne(adminQueryWrapper);
        System.out.println(admin);

    }

}
