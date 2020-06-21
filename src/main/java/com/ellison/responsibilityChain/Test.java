package com.ellison.responsibilityChain;


import org.junit.Before;
import org.springframework.context.ApplicationContext;

public class Test {

    private ApplicationContext applicationContext;

    @Before
    public void before() {
//        applicationContext = new AnnotationConfigApplicationContext(ComponentScanBean.class);
    }

//    @org.junit.Test
//    public void test1() {
//
//        String flag = "CQ";
//
//        Map<String, Province> beansOfType = applicationContext.getBeansOfType(Province.class);
//
//        com.xiangxue.jack.designPattern.responsibilityChain.CQ bean1 = (com.xiangxue.jack.designPattern.responsibilityChain.CQ)applicationContext.getBean("CQ1");
//        HB bean2 = (HB)applicationContext.getBean("HB1");
//        SC bean3 = (SC)applicationContext.getBean("SC1");
//        HN bean4 = (HN)applicationContext.getBean("HN1");
//
//        bean2.setProvince(bean1);
//        bean3.setProvince(bean2);
//        bean4.setProvince(bean3);
//        bean1.setProvince(bean4);
//
//        bean4.handler(flag);
//    }
}
