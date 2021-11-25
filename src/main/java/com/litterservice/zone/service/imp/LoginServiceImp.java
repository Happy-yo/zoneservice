package com.litterservice.zone.service.imp;

import com.litterservice.zone.bean.User;
import com.litterservice.zone.mapper.UserMapper;
import com.litterservice.zone.service.LoginService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService {

    @Autowired
    private UserMapper userMapper;


    public Map gerUser(long userid, String password) {
        HashMap map = new HashMap();
        User user = null;
        user = this.userMapper.getUser(userid, password);
        if(user == null) {
            map.put("RESULT", "F");
            map.put("Message", "登录失败");
        } else {
            map.put("RESULT", "T");
            map.put("MESSAGE", "登录成功");
            map.put("admin", Integer.valueOf(user.getAdmins()));
        }

        return map;
    }
    public Map addUser(long userid, String password, String username, int admins) {
        HashMap map = new HashMap();
        if(userid != 0L && password != null && username != null) {
            if(this.userMapper.findUser(userid) != 0) {
                map.put("RESULT", "F");
                map.put("MESSAGE", "用户名已存在");
            } else {
                int count = this.userMapper.addUser(userid, password, username, admins);
                if(count == 1) {
                    map.put("RESULT", "T");
                    map.put("MESSAGE", "注册成功");
                } else if(count == 0) {
                    map.put("RESULT", "F");
                    map.put("MESSAGE", "注册失败");
                }
            }
        } else {
            map.put("RESULT", "F");
            map.put("MESSAGE", "注册失败");
        }

        return map;
    }

    public Map alterPassword(long userid,String newpassword) {
        HashMap map = new HashMap();
        int alter_success = this.userMapper.alterPassword(userid, newpassword);
        if(alter_success == 1) {
            map.put("RESULT", "T");
            map.put("MESSAGE", "修改成功");
        } else {
            map.put("RESULT", "F");
            map.put("MESSAGE", "修改失败");
        }

        return map;
    }

    @Override
    public Map alterUser(long userid,String password, String username, int admins) {
        HashMap map = new HashMap();
        int alter_success = userMapper.alterUser(userid,password,username,admins);
        if(alter_success == 1) {
            map.put("RESULT", "T");
            map.put("MESSAGE", "修改成功");
        } else {
            map.put("RESULT", "F");
            map.put("MESSAGE", "修改失败");
        }
        return map;
    }

    @Override
    public Map getAllUser(long userid) {
        HashMap map = new HashMap();
        int admins = userMapper.findUserAdmin(userid);
        if(admins == 1){
            List<User> list = userMapper.getAllUser();
            if(list != null){
                map.put("RESULT", "T");
                map.put("MESSAGE", "请求成功");
                map.put("ROWS_DETAIL", list);
            }
            else {
                map.put("RESULT", "F");
                map.put("MESSAGE", "请求失败");
            }
        }
        else {
            map.put("RESULT", "F");
            map.put("MESSAGE", "该用户没有权限");
        }

        return map;
    }

    @Override
    public Map deleteUser(long userid) {
        HashMap map = new HashMap();
        int delete_success = userMapper.deleteUser(userid);
        if(delete_success == 1){
            map.put("RESULT", "T");
            map.put("MESSAGE", "删除成功");
        }
        else {
            map.put("RESULT", "F");
            map.put("MESSAGE", "删除失败");
        }
        return map;
    }
}