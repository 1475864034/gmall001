package com.gmall.service;

import com.gmall.bean.UmsMember;
import com.gmall.bean.UmsMemberReceiveAddress;


import java.util.List;

public interface UserService {
    List<UmsMember> getAllUsers();

    List<UmsMemberReceiveAddress> getUmsMemberReceiveAddress(String memberid);
}
