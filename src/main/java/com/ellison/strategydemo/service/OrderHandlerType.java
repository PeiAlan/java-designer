package com.ellison.strategydemo.service;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

/**
 * @author ellisonpei
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface OrderHandlerType {
    String source();
    String payMethod();
}
