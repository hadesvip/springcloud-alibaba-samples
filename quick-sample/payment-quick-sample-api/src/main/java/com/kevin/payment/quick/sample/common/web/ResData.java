package com.kevin.payment.quick.sample.common.web;

import com.kevin.payment.quick.sample.common.consts.RtCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangyong
 */
public class ResData<T> {

    private String code = "200";
    private String message = "";
    private T data;
    private String domain;
    private List<Error> errors;
    private String requestId;


    public boolean isSuccess() {
        if (this.code.equals(RtCode.SUCCESS.getCode())) {
            return true;
        }
        return false;
    }

    public ResData<T> ok(T data) {
        this.data = data;
        return this;
    }

    public ResData<T> ok(T data, String message) {
        this.data = data;
        this.message = message;
        return this;
    }

    public ResData<T> fail() {
        this.code = RtCode.SERVER_ERROR.getCode();
        return this;
    }

    public ResData<T> fail(String message) {
        this.code = RtCode.SERVER_ERROR.getCode();
        this.message = message;
        return this;
    }

    public ResData<T> fail(String message, RtCode code) {
        this.message = message;
        this.code = code.getCode();
        return this;
    }

    public ResData<T> fail(String message, RtCode code, String domain) {
        this.message = message;
        this.code = code.getCode();
        this.domain = domain;
        return this;
    }

    public ResData<T> fail(String message, RtCode code, String domain, String requestId) {
        this.message = message;
        this.code = code.getCode();
        this.domain = domain;
        this.requestId = requestId;
        return this;
    }

    public ResData<T> fail(String message, String code) {
        this.message = message;
        this.code = code;
        return this;
    }

    public ResData(T data) {
        super();
        this.data = data;
    }

    public ResData(String message) {
        super();
        this.message = message;
    }

    public ResData(String message, String code) {
        super();
        this.message = message;
        this.code = code;
    }

    public ResData() {
        super();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDomain() {
        return domain;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void addError(String name, String message) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(new Error(name + "\t" + message));
    }

}
