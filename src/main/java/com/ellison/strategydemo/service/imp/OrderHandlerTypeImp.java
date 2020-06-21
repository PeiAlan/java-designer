package com.ellison.strategydemo.service.imp;

import com.ellison.strategydemo.service.OrderHandlerType;

import java.lang.annotation.Annotation;

/**
 * @author ellisonpei
 */
public class OrderHandlerTypeImp implements OrderHandlerType {

    private String source;
    private String payMethod;

    public OrderHandlerTypeImp(String source, String payMethod) {
        this.source = source;
        this.payMethod = payMethod;
    }

    @Override
    public String source() {
        return source;
    }

    @Override
    public String payMethod() {
        return payMethod;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return OrderHandlerType.class;
    }

    @Override
    public int hashCode() {
        int hashCode = 0;
        hashCode += (127 * "source".hashCode()) ^ source.hashCode();
        hashCode += (127 * "payMethod".hashCode()) ^ payMethod.hashCode();
        return hashCode;
    }


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof OrderHandlerType)) {
            return false;
        }
        OrderHandlerType other = (OrderHandlerType) obj;
        return source.equals(other.source()) && payMethod.equals(other.payMethod());
    }
}
