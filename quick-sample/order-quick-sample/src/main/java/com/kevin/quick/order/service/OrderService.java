package com.kevin.quick.order.service;

import com.kevin.quick.common.core.bean.DO.OrderInfoDO;
import com.kevin.quick.common.core.bean.VO.OrderInfoVO;

/**
 * @author wangyong
 */
public interface OrderService {

  public OrderInfoVO getOrderInfoByOrderNo(String orderNo);

}
