package com.kevin.quick.order.service.impl;

import com.kevin.quick.common.core.bean.DO.OrderInfoDO;
import com.kevin.quick.common.core.bean.VO.OrderInfoVO;
import com.kevin.quick.common.dao.mapper.OrderInfoMapper;
import com.kevin.quick.order.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

  private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

  @Autowired
  private OrderInfoMapper orderInfoMapper;

  @Override
  public OrderInfoVO getOrderInfoByOrderNo(String orderNo) {
    OrderInfoDO orderInfoDO = orderInfoMapper.selectOrderInfoById(orderNo);
    OrderInfoVO orderInfoVO = new OrderInfoVO();
    BeanUtils.copyProperties(orderInfoDO, orderInfoVO);
    return orderInfoVO;
  }

}
