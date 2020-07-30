package com.kevin.quick.order.service.impl;

import com.kevin.quick.common.core.bean.DO.OrderInfoDO;
import com.kevin.quick.common.core.bean.VO.OrderInfoVO;
import com.kevin.quick.common.core.bean.VO.ProductInfoVO;
import com.kevin.quick.common.dao.mapper.OrderInfoMapper;
import com.kevin.quick.order.client.ProductClient;
import com.kevin.quick.order.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author wangyong
 */
@Service
public class OrderServiceImpl implements OrderService {

    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

    @Autowired
    private OrderInfoMapper orderInfoMapper;

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private ProductClient productClient;

    @Override
    public OrderInfoVO getOrderInfoByOrderNo(String orderNo) {
//    OrderInfoDO orderInfoDO = orderInfoMapper.selectOrderInfoById(orderNo);

        List<String> services = discoveryClient.getServices();
        System.out.println(services);

//        ProductInfoVO productInfoVO = restTemplate.getForObject("http://product-quick-sample" + "/product-quick/product/getProductInfoByProductNo/1",
//                ProductInfoVO.class);
//        System.out.println(productInfoVO);

        ProductInfoVO productInfoVO = productClient.getProductInfoByProductNo("1");
        System.out.println(productInfoVO);

        OrderInfoDO orderInfoDO = new OrderInfoDO();
        orderInfoDO.setOrderNo(UUID.randomUUID().toString().replace("-", ""));
        orderInfoDO.setUserName("admin");
        orderInfoDO.setProductNo("1");
        orderInfoDO.setCreateDt(new Date());
        orderInfoDO.setProductCount(5);
        OrderInfoVO orderInfoVO = new OrderInfoVO();
        BeanUtils.copyProperties(orderInfoDO, orderInfoVO);
        return orderInfoVO;
    }

}
