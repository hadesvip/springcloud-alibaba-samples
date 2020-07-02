package com.kevin.quick.order.controller;

import com.kevin.quick.common.core.bean.VO.OrderInfoVO;
import com.kevin.quick.order.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyong
 */
@RefreshScope
@RestController
@RequestMapping("/order")
public class OrderController {

  private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

  @Value("${order.quick.sample.appName}")
  private String appName;


  @Autowired
  private OrderService orderService;

  @GetMapping("/getByOrderNo/{orderNo}")
  public OrderInfoVO getByOrderNo(@PathVariable("orderNo") String orderNo) {
    logger.info("appName:{}", appName);
    return orderService.getOrderInfoByOrderNo(orderNo);
  }


}
