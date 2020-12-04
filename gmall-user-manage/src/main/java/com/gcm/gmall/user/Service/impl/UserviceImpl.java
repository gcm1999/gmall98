package com.gcm.gmall.user.Service.impl;

import com.gcm.gmall.bean.UserInfo;
import com.gcm.gmall.service.UserService;
import com.gcm.gmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserviceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }
}
