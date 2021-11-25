package com.litterservice.zone.service;

import java.util.Map;

public interface LoginService {
    Map gerUser(long userid, String password);
    Map addUser(long userid, String password, String username, int admins);
    Map alterPassword(long userid, String newpassword);
    Map alterUser(long userid,String password,String username,int admins);
    Map getAllUser(long userid);
    Map deleteUser(long userid);
}
