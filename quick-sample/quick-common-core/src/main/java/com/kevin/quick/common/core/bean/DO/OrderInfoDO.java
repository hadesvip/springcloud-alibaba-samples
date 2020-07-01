package com.kevin.quick.common.core.bean.DO;

import com.kevin.quick.common.core.bean.base.BaseEntity;
import java.util.Date;

/**
 * 订单信息
 *
 * @author wangyong
 */
public class OrderInfoDO extends BaseEntity {

  private String orderNo;

  private String userName;

  private Date createDt;

  private String productNo;

  private Integer productCount;


  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Date getCreateDt() {
    return createDt;
  }

  public void setCreateDt(Date createDt) {
    this.createDt = createDt;
  }

  public String getProductNo() {
    return productNo;
  }

  public void setProductNo(String productNo) {
    this.productNo = productNo;
  }

  public Integer getProductCount() {
    return productCount;
  }

  public void setProductCount(Integer productCount) {
    this.productCount = productCount;
  }

  @Override
  public String toString() {
    return "OrderInfo{" +
        "orderNo='" + orderNo + '\'' +
        ", userName='" + userName + '\'' +
        ", createDt=" + createDt +
        ", productNo='" + productNo + '\'' +
        ", productCount=" + productCount +
        '}';
  }
}
