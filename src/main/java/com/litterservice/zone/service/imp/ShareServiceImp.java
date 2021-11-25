package com.litterservice.zone.service.imp;

import com.litterservice.zone.bean.User;
import com.litterservice.zone.mapper.ShareMapper;
import com.litterservice.zone.mapper.UserMapper;
import com.litterservice.zone.service.ShareService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShareServiceImp implements ShareService {

    @Autowired
    private ShareMapper shareMapper;
    @Autowired
    private UserMapper userMapper;


    public Map updateShareImage(int id, String imagepath) {
        HashMap map = new HashMap();
        int addimage_success = this.shareMapper.addShareImage(id, imagepath);
        if(addimage_success == 1) {
            map.put("RESULT", "T");
            map.put("MESSAGE", "上传成功");
        } else {
            map.put("RESULT", "F");
            map.put("MESSAGE", "上传失败");
        }

        return map;
    }

    public Map updateShare(String title, int admire, int author, String update_time, int checkon) {
        HashMap map = new HashMap();
        int add_success = this.shareMapper.addShare(title, admire, author, update_time, checkon);
        if(add_success == 1) {
            map.put("RESULT", "T");
            map.put("MESSAGE", "上传成功");
        } else {
            map.put("RESULT", "F");
            map.put("MESSAGE", "上传失败");
        }

        return map;
    }

    public Map checkShare(int id, int checkon, long userid) {
        HashMap map = new HashMap();
        int user_admin = this.userMapper.findUserAdmin(userid);
        if(user_admin == 1) {
            int check_success = this.shareMapper.checkShare(id, checkon);
            if(check_success == 1) {
                map.put("RESULT", "T");
                map.put("MESSAGE", "审核状态修改成功");
            } else {
                map.put("RESULT", "F");
                map.put("MESSAGE", "审核状态修改失败");
            }
        } else {
            map.put("RESULT", "F");
            map.put("MESSAGE", "该用户没有权限");
        }

        return map;
    }

    public Map deleteShare(int id, int author) {
        HashMap map = new HashMap();
        int delete_success = this.shareMapper.deleteShare(id, author);
        if(delete_success == 1) {
            map.put("RESULT", "T");
            map.put("MESSAGE", "删除成功");
        } else {
            map.put("RESULT", "F");
            map.put("MESSAGE", "删除失败");
        }

        return map;
    }

    public Map getAllShare(User user) {
        HashMap map = new HashMap();
        long userid = user.getUserid();
        int admins = this.userMapper.findUserAdmin(userid);
        if(admins == 1) {
            List list = this.shareMapper.getAllShare();
            if(list != null) {
                map.put("RESULT", "T");
                map.put("MESSAGE", "请求成功");
                map.put("ROWS_DETAIL", list);
            } else {
                map.put("RESULT", "F");
                map.put("MESSAGE", "请求失败");
            }
        } else {
            map.put("RESULT", "F");
            map.put("MESSAGE", "该用户没有权限");
        }

        return map;
    }

    public Map getAllCheckedShare() {
        HashMap map = new HashMap();
        List list = this.shareMapper.getAllCheckedShare();
        if(list != null) {
            map.put("RESULT", "T");
            map.put("MESSAGE", "请求成功");
            map.put("ROWS_DETAIL", list);
        } else {
            map.put("RESULT", "F");
            map.put("MESSAGE", "请求失败");
        }

        return map;
    }

    @Override
    public Map getSelfShare(long userid) {
        HashMap map = new HashMap();
        List list = this.shareMapper.getSelfShare(userid);
        if(list != null) {
            map.put("RESULT", "T");
            map.put("MESSAGE", "请求成功");
            map.put("ROWS_DETAIL", list);
        } else {
            map.put("RESULT", "F");
            map.put("MESSAGE", "请求失败");
        }
        return map;
    }
}