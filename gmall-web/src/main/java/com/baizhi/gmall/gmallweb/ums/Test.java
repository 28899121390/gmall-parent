package com.baizhi.gmall.gmallweb.ums;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baizhi.gmall.pms.entity.Product;
import com.baizhi.gmall.pms.service.ProductService;
import com.baizhi.gmall.ums.entity.Admin;
import com.baizhi.gmall.ums.service.AdminService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class Test {


    @Reference
    AdminService adminService;

    @GetMapping(value = "/admin/test")
    public Admin getProduct() {

        Admin admin = adminService.login("admin", "123456");
        System.out.println(admin);
        return admin;
    }
}
