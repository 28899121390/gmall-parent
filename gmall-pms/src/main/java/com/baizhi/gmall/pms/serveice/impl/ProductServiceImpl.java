package com.baizhi.gmall.pms.serveice.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baizhi.gmall.pms.entity.Product;
import com.baizhi.gmall.pms.mapper.ProductMapper;
import com.baizhi.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 * @Component 注解加入工厂
 * @Service 暴露dubbo服务
 * @author htf
 * @since 2019-12-27
 */
@Component
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
