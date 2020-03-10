package com.kevin.payment.quick.sample.domain.po;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wangyong
 */
@Data
@NoArgsConstructor
public class PaymentPO implements Serializable {

    /**
     * 支付流水号
     */
    private String paymentNo;

    /**
     * 交易金额
     */
    private Long amount;

    /**
     * 状态
     */
    private String status;

    /**
     * 创建时间
     */
    private Date createDateTime;


}
