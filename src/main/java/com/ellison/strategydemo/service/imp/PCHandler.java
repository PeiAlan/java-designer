package com.ellison.strategydemo.service.imp;

import com.ellison.strategydemo.domain.Order;
import com.ellison.strategydemo.service.OrderHandler;
import com.ellison.strategydemo.service.OrderHandlerType;

/**
 * @author ellisonpei
 */
@OrderHandlerType(source = "pc", payMethod = "cardPay")
public class PCHandler implements OrderHandler {
    @Override
    public void handle(Order order) {
        System.out.println("处理PC端, cardPay订单！！");
    }
}
