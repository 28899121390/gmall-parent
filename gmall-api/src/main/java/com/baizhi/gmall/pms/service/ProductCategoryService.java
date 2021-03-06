package com.baizhi.gmall.pms.service;

import com.baizhi.gmall.pms.entity.ProductCategory;
import com.baizhi.gmall.vo.product.PmsProductCategoryWithChildrenItem;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 产品分类 服务类
 * </p>
 *
 * @author htf
 * @since 2019-12-27
 */
public interface ProductCategoryService extends IService<ProductCategory> {

    List<PmsProductCategoryWithChildrenItem> listCatelogWithChilder(Integer i);
}
