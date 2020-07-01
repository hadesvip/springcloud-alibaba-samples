package com.kevin.quick.product.controller;

import com.kevin.quick.common.core.bean.VO.ProductInfoVO;
import com.kevin.quick.product.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyong
 */
@RequestMapping("/product")
@RestController
public class ProductController {

  private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

  @Autowired
  private ProductService productService;


  @RequestMapping("/getProductInfoByProductNo/{productNo}")
  public ProductInfoVO getProductInfoByProductNo(@PathVariable("productNo") String productNo) {
    return productService.getProductInfoByProductNo(productNo);
  }


}
