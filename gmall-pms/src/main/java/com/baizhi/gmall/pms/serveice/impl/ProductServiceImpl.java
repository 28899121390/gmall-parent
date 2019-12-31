package com.baizhi.gmall.pms.serveice.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baizhi.gmall.pms.entity.Product;
import com.baizhi.gmall.pms.mapper.ProductMapper;
import com.baizhi.gmall.pms.service.ProductService;
import com.baizhi.gmall.vo.PageInfoVo;
import com.baizhi.gmall.vo.product.PmsProductQueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author htf
 * @Component 注解加入工厂
 * @Service 暴露dubbo服务
 * @since 2019-12-27
 */
@Component
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Autowired
    ProductMapper productMapper;


    @Override
    public PageInfoVo productPageInfo(PmsProductQueryParam productQueryParam) {


//        @ApiModelProperty("上架状态")
//        private Integer publishStatus;
//        @ApiModelProperty("审核状态")
//        private Integer verifyStatus;
//        @ApiModelProperty("商品名称模糊关键字")
//        private String keyword;
//        @ApiModelProperty("商品货号")
//        private String productSn;
//        @ApiModelProperty("商品分类编号")
//        private Long productCategoryId;
//        @ApiModelProperty("商品品牌编号")
//        private Long brandId;

        QueryWrapper<Product> wrapper = new QueryWrapper<>();

        if (productQueryParam.getBrandId() != null) {
            wrapper.eq("brand_id", productQueryParam.getBrandId());
        }
        if (!StringUtils.isEmpty(productQueryParam.getKeyword())) {
            wrapper.like("name", productQueryParam.getKeyword());
        }
        if (!StringUtils.isEmpty(productQueryParam.getProductSn())) {
            wrapper.like("product_sn", productQueryParam.getProductSn());
        }
        if (productQueryParam.getProductCategoryId() != null) {
            wrapper.eq("product_category_id", productQueryParam.getProductCategoryId());
        }
        if (productQueryParam.getPublishStatus() != null) {
            wrapper.eq("publish_status", productQueryParam.getPublishStatus());
        }
        if (productQueryParam.getVerifyStatus() != null) {
            wrapper.eq("verify_status", productQueryParam.getVerifyStatus());
        }

        IPage<Product> page = productMapper.selectPage(new Page<Product>(productQueryParam.getPageNum(), productQueryParam.getPageSize()), wrapper);
        //总条数  总页数  一页多少条  第几页
        PageInfoVo pageInfoVo = new PageInfoVo(
                page.getTotal(), page.getPages(),
                productQueryParam.getPageSize(),
                page.getRecords(), page.getCurrent());
        return pageInfoVo;
    }
}
