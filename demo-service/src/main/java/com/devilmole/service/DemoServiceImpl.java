package com.devilmole.service;

import com.devilmole.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/2/23 0023.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Autowired
    private UserMapper userDao;

    public String getNumTest(){
        double test=userDao.getMaxNum();
        System.out.println("------asdfasdfas------>"+test);
        return null;
    }
}
