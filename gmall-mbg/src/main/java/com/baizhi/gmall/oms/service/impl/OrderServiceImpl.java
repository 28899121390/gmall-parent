package com.baizhi.gmall.oms.service.impl;

import com.baizhi.gmall.oms.entity.Order;
import com.baizhi.gmall.oms.mapper.OrderMapper;
import com.baizhi.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author htf
 * @since 2019-12-27
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
