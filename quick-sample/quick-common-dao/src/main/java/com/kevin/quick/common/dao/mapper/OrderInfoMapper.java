package com.kevin.quick.common.dao.mapper;


import com.kevin.quick.common.core.bean.DO.OrderInfoDO;

/**
 * @author wangyong
 */
public interface OrderInfoMapper {

  OrderInfoDO selectOrderInfoById(String orderNo);
}
