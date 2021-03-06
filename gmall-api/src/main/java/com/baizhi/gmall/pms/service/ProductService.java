package com.baizhi.gmall.pms.service;

import com.baizhi.gmall.pms.entity.Product;
import com.baizhi.gmall.vo.PageInfoVo;
import com.baizhi.gmall.vo.product.PmsProductQueryParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author htf
 * @since 2019-12-27
 */
public interface ProductService extends IService<Product> {

    PageInfoVo productPageInfo(PmsProductQueryParam productQueryParam);
}
