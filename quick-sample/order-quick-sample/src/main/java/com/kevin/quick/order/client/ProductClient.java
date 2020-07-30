package com.kevin.quick.order.client;

import com.kevin.quick.common.core.bean.VO.ProductInfoVO;
import com.kevin.quick.order.client.hystrix.ProductClientHystrix;
import com.kevin.quick.order.configuration.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author wangyong
 */
@FeignClient(value = "product-quick-sample",
        configuration = FeignConfiguration.class,
        fallback = ProductClientHystrix.class)
public interface ProductClient {


    @GetMapping("/product-quick/product/getProductInfoByProductNo/{productNo}")
    ProductInfoVO getProductInfoByProductNo(@PathVariable("productNo") String productNo);
}
