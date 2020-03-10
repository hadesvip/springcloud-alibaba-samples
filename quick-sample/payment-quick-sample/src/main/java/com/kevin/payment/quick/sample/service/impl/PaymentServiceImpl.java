package com.kevin.payment.quick.sample.service.impl;

import com.kevin.payment.quick.sample.dao.IPaymentDao;
import com.kevin.payment.quick.sample.service.IPaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangyong
 */
@Service
public class PaymentServiceImpl implements IPaymentService {

    @Resource
    private IPaymentDao paymentDao;



}
