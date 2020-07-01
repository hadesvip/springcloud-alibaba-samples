package com.kevin.quick.common.core.bean.VO;

/**
 * @author wangyong
 */
public class ProductInfoVO {

  private String productNo;

  private String productName;

  private String productStore;

  private double productPrice;

  public String getProductNo() {
    return productNo;
  }

  public void setProductNo(String productNo) {
    this.productNo = productNo;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getProductStore() {
    return productStore;
  }

  public void setProductStore(String productStore) {
    this.productStore = productStore;
  }

  public double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(double productPrice) {
    this.productPrice = productPrice;
  }
}
