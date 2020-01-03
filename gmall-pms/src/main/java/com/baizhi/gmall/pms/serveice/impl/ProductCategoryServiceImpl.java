package com.baizhi.gmall.pms.serveice.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baizhi.gmall.constant.CacheConstant;
import com.baizhi.gmall.pms.entity.ProductCategory;
import com.baizhi.gmall.pms.mapper.ProductCategoryMapper;
import com.baizhi.gmall.pms.service.ProductCategoryService;
import com.baizhi.gmall.vo.product.PmsProductCategoryWithChildrenItem;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 产品分类 服务实现类
 * </p>
 *
 * @author htf
 * @since 2019-12-27
 */
@Component
@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryService {


    @Autowired
    ProductCategoryMapper productCategoryMapper;

    @Autowired
    RedisTemplate<Object, Object> redisTemplate;

    @Override
    public List<PmsProductCategoryWithChildrenItem> listCatelogWithChilder(Integer i) {

        Object cache = redisTemplate.opsForValue().get(CacheConstant.CATEGORY_MENU_CACHE_KEY);
        List<PmsProductCategoryWithChildrenItem> pmsProductCategoryWithChildrenItems;
        if (cache == null) {
            pmsProductCategoryWithChildrenItems = productCategoryMapper.queryCategoryAndChildren(i);
            redisTemplate.opsForValue().set(CacheConstant.CATEGORY_MENU_CACHE_KEY,pmsProductCategoryWithChildrenItems);
        } else {
            pmsProductCategoryWithChildrenItems = (List<PmsProductCategoryWithChildrenItem>) cache;
        }
        return pmsProductCategoryWithChildrenItems;

    }
}
