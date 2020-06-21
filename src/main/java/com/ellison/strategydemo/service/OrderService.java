package com.ellison.strategydemo.service;

import com.ellison.strategydemo.domain.Order;
import com.ellison.strategydemo.service.imp.OrderHandlerTypeImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author ellisonpei
 */
@Service
public class OrderService {


    private Map<OrderHandlerType, OrderHandler> orderHandlerMap;

    @Autowired
    public void setOrderHandleMap(List<OrderHandler> orderHandlers) {
        // 注入各种类型的订单处理类
        orderHandlerMap = orderHandlers.stream().collect(
                Collectors.toMap(orderHandler -> AnnotationUtils.findAnnotation(orderHandler.getClass(), OrderHandlerType.class),
                        v -> v,(v1, v2) -> v1));
    }

    public void orderService(Order order) {
        // ...一些前置处理
        System.out.println("前置处理方法");
        // 通过订单来源以及支付方式来 确定对应的handler
        OrderHandlerType orderHandlerType = new OrderHandlerTypeImp(order.getSource(), order.getPayMethod());
        OrderHandler orderHandler = orderHandlerMap.get(orderHandlerType);
        orderHandler.handle(order);

        // ...一些后置处理
        System.out.println("后置处理方法");
    }
}
