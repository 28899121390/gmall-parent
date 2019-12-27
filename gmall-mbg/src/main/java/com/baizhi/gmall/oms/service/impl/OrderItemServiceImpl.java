package com.baizhi.gmall.oms.service.impl;

import com.baizhi.gmall.oms.entity.OrderItem;
import com.baizhi.gmall.oms.mapper.OrderItemMapper;
import com.baizhi.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author htf
 * @since 2019-12-27
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
