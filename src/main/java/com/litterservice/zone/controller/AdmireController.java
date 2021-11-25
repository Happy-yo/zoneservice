package com.litterservice.zone.controller;

import com.litterservice.zone.bean.Admire;
import com.litterservice.zone.bean.User;
import com.litterservice.zone.service.imp.AdmireServiceImp;
import com.litterservice.zone.util.PrintLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping({"/zone/action/v3"})
public class AdmireController {

    @Autowired
    private AdmireServiceImp admireServiceImp;

    @PostMapping({"/addadmire"})
    public Map addAdmier(@RequestBody Admire admire, HttpServletRequest request) {
        Map map = this.admireServiceImp.addAdmire(admire);
        PrintLog.printLog(request.getRequestURL().toString(), admire);
        return map;
    }


    @PostMapping({"/deleteadmire"})
    public Map deleteAdmire(@RequestBody Admire admire, HttpServletRequest request) {
        Map map = this.admireServiceImp.deleteAdmire(admire);
        PrintLog.printLog(request.getRequestURL().toString(), admire);
        return map;
    }


    @PostMapping({"/getselfadmire"})
    public Map getSelfAdmire(@RequestBody User user, HttpServletRequest request) {
        Map map = this.admireServiceImp.getSelfAdmire(user);
        PrintLog.printLog(request.getRequestURL().toString(), user);
        return map;
    }
}