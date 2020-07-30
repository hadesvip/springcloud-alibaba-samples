package com.kevin.quick.order.client.hystrix;

import com.kevin.quick.common.core.bean.VO.ProductInfoVO;
import com.kevin.quick.order.client.ProductClient;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author wangyong
 */
@Component
public class ProductClientHystrix implements ProductClient {
    @Override
    public ProductInfoVO getProductInfoByProductNo(String productNo) {
        ProductInfoVO productInfoVO = new ProductInfoVO();
        productInfoVO.setProductName("默认产品");
        productInfoVO.setProductNo(UUID.randomUUID().toString().replace("-", ""));
        productInfoVO.setProductPrice(9.9);
        productInfoVO.setProductStore(String.valueOf(Integer.MAX_VALUE));
        return productInfoVO;
    }
}
