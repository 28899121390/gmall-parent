package com.baizhi.gmall.pms;

import com.baizhi.gmall.pms.entity.Brand;
import com.baizhi.gmall.pms.entity.Product;
import com.baizhi.gmall.pms.service.BrandService;
import com.baizhi.gmall.pms.service.ProductService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = GmallPmsApplication.class)
@RunWith(value = SpringRunner.class)
public class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;

    @Autowired
    BrandService brandService;

    @Test                
    public void contextLoads() {
        Brand brand=new Brand();
        brand.setName("大花");
        Brand byId = brandService.getById(113);
//        Product byId = productService.getById(1);
        System.out.println(byId);
    }

}
