package com.gmall.user.controller;

import com.gmall.bean.UmsMember;
import com.gmall.bean.UmsMemberReceiveAddress;
import com.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("findByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressById(@RequestParam(name = "memberid")String memberid){
        List<UmsMemberReceiveAddress> UmsMemberReceiveAddresses=userService.getUmsMemberReceiveAddress(memberid);
        return UmsMemberReceiveAddresses;
    }

    @RequestMapping("getAllUsers")
    @ResponseBody
    public List<UmsMember> getAllUsers(){

        List<UmsMember> umsMembers=userService.getAllUsers();
        return umsMembers;
    }

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello user";
    }
}
