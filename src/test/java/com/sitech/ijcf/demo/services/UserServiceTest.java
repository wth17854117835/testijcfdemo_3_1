package com.sitech.ijcf.demo.services;

import com.sitech.ijcf.demo.dto.User;
import com.sitech.ijcf.demo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class UserServiceTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void qryUserInfo() {
        System.out.println("-------------------BEGIN--------------------------------");
        User user = new User();
        user.setName("张三");
        Map<String,Object> paraMap = new HashMap<>();
        paraMap.put("user",user);

        Map map = userMapper.getUserInfo(paraMap);
        System.out.println(map);
        System.out.println("-------------------END--------------------------------");
    }

}