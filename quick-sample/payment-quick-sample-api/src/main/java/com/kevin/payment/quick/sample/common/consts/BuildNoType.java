package com.kevin.payment.quick.sample.common.consts;

/**
 * 构建流水类型
 *
 * @author wangyong
 */
public enum BuildNoType {

    /**
     * 付款
     */
    PAYMENT("2");

    /**
     * 类型
     */
    private String type;


    public String getType() {
        return type;
    }

    BuildNoType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BuildNoType{");
        sb.append("type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
