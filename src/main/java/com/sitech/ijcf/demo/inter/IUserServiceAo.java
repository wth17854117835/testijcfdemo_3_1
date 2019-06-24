package com.sitech.ijcf.demo.inter;

import com.sitech.ijcf.demo.dto.User;

import java.util.Map;

public interface IUserServiceAo {

    /**
     * 查询用户信息
     * @author wangth_oup
     * @date 2019-05-13
     */
    public Map qryUserInfo(User user);
}
