package com.baizhi.gmall.pms.mapper;

import com.baizhi.gmall.pms.entity.ProductCategory;
import com.baizhi.gmall.vo.product.PmsProductCategoryWithChildrenItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 产品分类 Mapper 接口
 * </p>
 *
 * @author htf
 * @since 2019-12-27
 */
public interface ProductCategoryMapper extends BaseMapper<ProductCategory> {

    List<PmsProductCategoryWithChildrenItem> queryCategoryAndChildren(Integer i);
}
