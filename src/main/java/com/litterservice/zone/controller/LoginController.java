package com.litterservice.zone.controller;

import com.litterservice.zone.bean.User;
import com.litterservice.zone.service.imp.LoginServiceImp;
import com.litterservice.zone.util.PrintLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping({"/zone/action/v1"})
public class LoginController {

    @Autowired
    private LoginServiceImp serviceImp;


    @PostMapping({"/login"})
    public Map getLogin(@RequestBody User user, HttpServletRequest request) {
        Map map = this.serviceImp.gerUser(user.getUserid(), user.getPassword());
        PrintLog.printLog(request.getRequestURL().toString(), user);
        return map;
    }

    @PostMapping({"/register"})
    public Map addUser(@RequestBody User user, HttpServletRequest request) {
        Map map = this.serviceImp.addUser(user.getUserid(), user.getPassword(), user.getUsername(), user.getAdmins());
        PrintLog.printLog(request.getRequestURL().toString(), user);
        return map;
    }

    @PostMapping({"/alterpassword"})
    public Map alterPassword(@RequestBody User user, HttpServletRequest request) {
        Map map = this.serviceImp.alterPassword(user.getUserid(), user.getPassword());
        PrintLog.printLog(request.getRequestURL().toString(), user);
        return map;
    }

    @PostMapping("/alteruser")
    public Map alterUser(@RequestBody User user,HttpServletRequest request){
        Map map = serviceImp.alterUser(user.getUserid(),user.getPassword(),user.getUsername(),user.getAdmins());
        PrintLog.printLog(request.getRequestURL().toString(), user);
        return map;
    }

    @PostMapping("/getalluser")
    public Map getAllUser(@RequestBody User user,HttpServletRequest request){
        Map map = serviceImp.getAllUser(user.getUserid());
        PrintLog.printLog(request.getRequestURL().toString(), user);
        return map;
    }

    @PostMapping("/deleteuser")
    public Map deleteUser(@RequestBody User user,HttpServletRequest request){
        Map map = serviceImp.deleteUser(user.getUserid());
        PrintLog.printLog(request.getRequestURL().toString(), user);
        return map;
    }

}
