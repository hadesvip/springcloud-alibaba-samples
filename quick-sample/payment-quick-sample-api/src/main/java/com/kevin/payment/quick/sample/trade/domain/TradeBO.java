package com.kevin.payment.quick.sample.trade.domain;

import com.kevin.quick.common.core.bean.base.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 交易
 *
 * @author wangyong
 */
@Data
public class TradeBO extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 340683231156802936L;

    private Long id;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 状态
     */
    private String status;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 商户订单号
     */
    private String merchantOrderNo;
    /**
     * 订单金额
     */
    private Long orderAmount;
    /**
     * 订单来源
     */
    private String orderFrom;
    /**
     * 商家名称
     */
    private String merchantName;
    /**
     * 商户编号
     */
    private String merchantNo;
    /**
     * 下单时间
     */
    private Date orderTime;
    /**
     * 下单日期
     */
    private Object orderDate;
    /**
     * 订单有效期(单位秒)
     */
    private Integer orderPeriod;
    /**
     * 到期时间
     */
    private Date expireTime;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改者
     */
    private String editor;
    /**
     * 创建者
     */
    private String creator;
    /**
     * 最后修改时间
     */
    private Date editTime;
    /**
     * 支付备注
     */
    private String remark;
}