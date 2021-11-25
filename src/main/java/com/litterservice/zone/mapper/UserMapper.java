package com.litterservice.zone.mapper;

import com.litterservice.zone.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    User getUser(long userid, String password);
    int findUser(long userid);
    int addUser(long userid, String password, String username, int admins);
    int alterPassword(long userid, String newpassword);
    int findUserAdmin(long userid);
    int alterUser(long userid,String password,String username,int admins);
    List getAllUser();
    int deleteUser(long userid);
}
