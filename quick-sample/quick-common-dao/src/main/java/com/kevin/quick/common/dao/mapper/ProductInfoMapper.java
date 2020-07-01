package com.kevin.quick.common.dao.mapper;

import com.kevin.quick.common.core.bean.DO.ProductInfoDO;

/**
 * @author wangyong
 */
public interface ProductInfoMapper {

  ProductInfoDO selectProductInfoById(String productNo);
}
