package com.kevin.payment.quick.sample.common.service.impl;

import com.kevin.payment.quick.sample.common.consts.BuildNoType;
import com.kevin.payment.quick.sample.common.service.IBuildNoService;

/**
 * 订单流水号
 *
 * @author wangyong
 */
public class BuildNoServiceImpl implements IBuildNoService {


    @Override
    public String buildPaymentOrderNo() {
        return BuildNoType.PAYMENT.getType() + "";
    }
}
