package com.kevin.payment.quick.sample.dao;

import com.kevin.payment.quick.sample.domain.po.PaymentPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wangyong
 */
@Mapper
public interface IPaymentDao {

    void save(PaymentPO payment);

    PaymentPO queryPayment(PaymentPO payment);

}
