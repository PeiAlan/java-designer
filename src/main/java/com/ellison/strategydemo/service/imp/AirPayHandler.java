package com.ellison.strategydemo.service.imp;

import com.ellison.strategydemo.domain.Order;
import com.ellison.strategydemo.service.OrderHandler;
import com.ellison.strategydemo.service.OrderHandlerType;

/**
 * @author ellisonpei
 */
@OrderHandlerType(source = "mobile", payMethod = "airPay")
public class AirPayHandler implements OrderHandler {
    @Override
    public void handle(Order order) {
        System.out.println("支付宝处理了订单");
    }
}
