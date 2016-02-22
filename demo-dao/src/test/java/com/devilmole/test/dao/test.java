package com.devilmole.test.dao;


import com.devilmole.dao.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.Reader;

/**
 * Created by Administrator on 2016/2/19 0019.
 */
public class test {

   private UserMapper userMap;

    @Before
    public void setUp()
    {
//        // create a SqlSessionFactory
//        System.out.println("-------123-->");
//        Reader reader = Resources.getResourceAsReader("conf/spring-mybatis.xml");
//        //Reader reader = Resources.getResourceAsReader("conf/spring-config.xml");
//        System.out.println(reader.toString());
//        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//        reader.close();
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:conf/spring-config.xml"
                ,"classpath:conf/spring-mybatis.xml");
        userMap=(UserMapper)context.getBean("userMapper");

    }
    @Test
    public void testFunction(){
        double result=userMap.getMaxNum();
        System.out.println("result---------》"+result);
    }

}
