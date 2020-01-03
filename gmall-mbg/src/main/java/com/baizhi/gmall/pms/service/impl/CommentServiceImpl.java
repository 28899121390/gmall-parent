package com.baizhi.gmall.pms.service.impl;

import com.baizhi.gmall.pms.entity.Comment;
import com.baizhi.gmall.pms.mapper.CommentMapper;
import com.baizhi.gmall.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author htf
 * @since 2020-01-03
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
