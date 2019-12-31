package com.baizhi.gmall.pms.serveice.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baizhi.gmall.pms.entity.Brand;
import com.baizhi.gmall.pms.mapper.BrandMapper;
import com.baizhi.gmall.pms.service.BrandService;
import com.baizhi.gmall.vo.PageInfoVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;


/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author htf
 * @since 2019-12-27
 */

@Service
@Component
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

    @Autowired
    BrandMapper brandMapper;

    @Override
    public PageInfoVo brandPageInfo(String keyword, Integer pageNum, Integer pageSize) {
        QueryWrapper<Brand> name = null;

        if (!StringUtils.isEmpty(keyword)) {
            name = new QueryWrapper<Brand>().like("name", keyword);
        }

        IPage<Brand> page = brandMapper.selectPage(new Page<Brand>(pageNum, pageSize), name);

        PageInfoVo pageInfoVo = new PageInfoVo(page.getTotal(), page.getPages(), pageSize.longValue(), page.getRecords(), pageNum.longValue());

        return pageInfoVo;
    }
}
