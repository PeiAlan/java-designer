package com.ellison.strategydemo.service;

import com.ellison.strategydemo.domain.Order;

/**
 * @author ellisonpei
 */
public interface OrderHandler {

    void handle(Order order);
}
