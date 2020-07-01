package com.kevin.quick.product.service;

import com.kevin.quick.common.core.bean.VO.ProductInfoVO;

/**
 * @author wangyong
 */
public interface ProductService {

  ProductInfoVO getProductInfoByProductNo(String productNo);

}
