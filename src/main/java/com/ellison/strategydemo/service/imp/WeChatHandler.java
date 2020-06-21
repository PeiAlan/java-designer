package com.ellison.strategydemo.service.imp;

import com.ellison.strategydemo.domain.Order;
import com.ellison.strategydemo.service.OrderHandler;
import com.ellison.strategydemo.service.OrderHandlerType;

/**
 * @author ellisonpei
 */
@OrderHandlerType(source = "mobile", payMethod = "weChat")
public class WeChatHandler implements OrderHandler {
    @Override
    public void handle(Order order) {
        System.out.println("微信支付处理了订单");
    }
}
