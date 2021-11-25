package com.litterservice.zone.service;

import com.litterservice.zone.bean.Admire;
import com.litterservice.zone.bean.User;

import java.util.Map;

public interface AdmireService {
    Map addAdmire(Admire admire);
    Map deleteAdmire(Admire admire);
    Map getSelfAdmire(User user);
}
