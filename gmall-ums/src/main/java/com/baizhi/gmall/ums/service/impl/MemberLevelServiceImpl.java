package com.baizhi.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baizhi.gmall.ums.entity.MemberLevel;
import com.baizhi.gmall.ums.mapper.MemberLevelMapper;
import com.baizhi.gmall.ums.service.MemberLevelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 会员等级表 服务实现类
 * </p>
 *
 * @author htf
 * @since 2019-12-27
 */
@Service
@Component
public class MemberLevelServiceImpl extends ServiceImpl<MemberLevelMapper, MemberLevel> implements MemberLevelService {


}
