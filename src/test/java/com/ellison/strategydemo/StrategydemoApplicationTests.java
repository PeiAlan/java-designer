package com.ellison.strategydemo;

import com.ellison.strategydemo.domain.Order;
import com.ellison.strategydemo.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class StrategydemoApplicationTests {

	@Autowired
	private OrderService orderService;

	@Test
	public void test(){
		Order order = new Order();
		order.setSource("mobile");
		order.setPayMethod("airPay");
		order.setAmount(new BigDecimal(200));
		order.setCode("1020202020");
		orderService.orderService(order);
	}
}
