package com.baizhi.gmall.ums.service.impl;

import com.baizhi.gmall.ums.entity.Member;
import com.baizhi.gmall.ums.mapper.MemberMapper;
import com.baizhi.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author htf
 * @since 2019-12-27
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
