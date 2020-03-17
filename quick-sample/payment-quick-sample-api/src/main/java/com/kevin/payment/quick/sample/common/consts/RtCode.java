package com.kevin.payment.quick.sample.common.consts;

/**
 * 返回码
 *
 * @author wangyong
 */
public enum RtCode {
    /**
     * 成功
     **/
    SUCCESS("200", "成功"),

    /**
     * 参数错误
     **/
    PARAM_ERROR("400", "参数错误"),

    /**
     * 禁止访问
     **/
    FORBIDDEN("403", "禁止访问"),

    /**
     * 资源不存在
     **/
    NOT_FOUND("404", "资源不存在"),

    /**
     * 不支持的请求方法
     **/
    REQUEST_METHOD_NOT_SUPPORTED("405", "不支持的请求方法"),

    /**
     * 服务限流
     **/
    SERVER_LIMIT("429", "服务限流"),

    /**
     * 服务器错误
     **/
    SERVER_ERROR("500", "服务器错误"),

    /**
     * 服务降级
     **/
    SERVER_DOWNGRADE("700", "服务降级");


    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    RtCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RtCode{");
        sb.append("code='").append(code).append('\'');
        sb.append(", msg='").append(msg).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
