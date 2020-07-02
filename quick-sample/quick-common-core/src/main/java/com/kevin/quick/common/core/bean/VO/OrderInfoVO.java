package com.kevin.quick.common.core.bean.VO;

import java.util.Date;

/**
 * @author wangyong
 */
public class OrderInfoVO {

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
    String sb = "OrderInfoVO{" + "orderNo='" + orderNo + '\''
        + ", userName='" + userName + '\''
        + ", createDt=" + createDt
        + ", productNo='" + productNo + '\''
        + ", productCount=" + productCount
        + '}';
    return sb;
  }
}