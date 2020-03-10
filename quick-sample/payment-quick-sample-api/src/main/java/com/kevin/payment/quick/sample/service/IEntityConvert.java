package com.kevin.payment.quick.sample.service;

/**
 * 对象转换
 *
 * @author wangyong
 */
public interface IEntityConvert<S, T> {

    default T convert(S source) {
        return null;
    }

}
