package com.baizhi.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baizhi.gmall.ums.entity.Admin;
import com.baizhi.gmall.ums.mapper.AdminMapper;
import com.baizhi.gmall.ums.service.AdminService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;


/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author htf
 * @since 2019-12-27
 */
@Service
@Component
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    public Admin login(String username, String password) {
        String md5password = DigestUtils.md5DigestAsHex(password.getBytes());
        QueryWrapper<Admin> adminQueryWrapper = new QueryWrapper<Admin>().eq("username", username).eq("password", md5password);
        Admin admin = adminMapper.selectOne(adminQueryWrapper);
        return admin;
    }

    public Admin getUserInfo(String userName) {
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<Admin>().eq("username", userName);
        Admin admin = adminMapper.selectOne(queryWrapper);
        return admin;
    }
}
