package com.kevin.payment.quick.sample.trade.service.impl;

import com.kevin.payment.quick.sample.trade.dao.TradeDao;
import com.kevin.payment.quick.sample.trade.service.ITradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 交易服务
 *
 * @author wangyong
 */
@Service
public class TradeServiceImpl implements ITradeService {

    @Resource
    private TradeDao tradeDao;


}
