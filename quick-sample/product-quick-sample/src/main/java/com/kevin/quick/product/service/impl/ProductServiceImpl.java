package com.kevin.quick.product.service.impl;

import com.kevin.quick.common.core.bean.DO.ProductInfoDO;
import com.kevin.quick.common.core.bean.VO.ProductInfoVO;
import com.kevin.quick.common.dao.mapper.ProductInfoMapper;
import com.kevin.quick.product.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangyong
 */
@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductInfoMapper productInfoMapper;

  @Override
  public ProductInfoVO getProductInfoByProductNo(String productNo) {
    ProductInfoDO productInfoDO = productInfoMapper.selectProductInfoById(productNo);
    ProductInfoVO productInfoVO = new ProductInfoVO();
    BeanUtils.copyProperties(productInfoDO, productInfoVO);
    return productInfoVO;
  }
}
