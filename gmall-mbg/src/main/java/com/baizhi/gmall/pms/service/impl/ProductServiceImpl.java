package com.baizhi.gmall.pms.service.impl;

import com.baizhi.gmall.pms.entity.Product;
import com.baizhi.gmall.pms.mapper.ProductMapper;
import com.baizhi.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author htf
 * @since 2020-01-03
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
