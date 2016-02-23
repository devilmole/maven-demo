package com.devilmole.service;

import com.devilmole.common.util.StringUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2016/2/23 0023.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:conf/spring-config.xml","classpath:conf/spring-mybatis.xml"})
public class test {

    @Autowired
    private DemoService service;
//    @Before
//    public void loadResource(){
//        @SuppressWarnings("resource")
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:conf/spring-config.xml", "classpath:conf/spring-mybatis.xml");
//        service=(DemoService)context.getBean("demoService");
//        System.out.println("before done");
//    }

    @Test
    public void test(){
        System.out.println("in test----->"+service.getNumTest());
        System.out.println(StringUtil.getUpper("13aabb123"));
    }
}
