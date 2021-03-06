package com.baizhi.gmall.pms.service;

import com.baizhi.gmall.pms.entity.Brand;
import com.baizhi.gmall.vo.PageInfoVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 品牌表 服务类
 * </p>
 *
 * @author htf
 * @since 2019-12-27
 */
public interface BrandService extends IService<Brand> {

    PageInfoVo brandPageInfo(String keyword, Integer pageNum, Integer pageSize);
}
