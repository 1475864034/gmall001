package com.gmall.user.service.impl;

import com.gmall.user.bean.UmsMember;
import com.gmall.user.mapper.UserMapper;
import com.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUsers() {
//        正常的mybatid查询操作
//        List<UmsMember> umsMembers=userMapper.selectAllUsers();
//        通用mapper的查询操作
        List<UmsMember> umsMembers=userMapper.selectAll();
        return umsMembers;
    }
}
