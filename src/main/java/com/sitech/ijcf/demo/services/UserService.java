package com.sitech.ijcf.demo.services;

import com.sitech.ijcf.demo.dto.User;
import com.sitech.ijcf.demo.inter.IUserServiceAo;
import com.sitech.ijcf.demo.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangth_oup
 * @date 2019-05-13 15:00
 **/
@Service("userServiceAoSvc")
public class UserService implements IUserServiceAo {

    @Resource
    private UserMapper userMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Override
    @ResponseBody
    public Map qryUserInfo(User user) {
        Map<String,Object> paraMap =new HashMap<String, Object>();
        paraMap.put("name",user.getName());
        paraMap.put("pwd",user.getPwd());
        paraMap.put("nick",user.getNick());
        Map userMap = userMapper.getUserInfo(paraMap);
        return userMap;
    }
}
