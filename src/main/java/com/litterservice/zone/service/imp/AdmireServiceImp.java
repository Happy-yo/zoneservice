package com.litterservice.zone.service.imp;

import com.litterservice.zone.bean.Admire;
import com.litterservice.zone.bean.User;
import com.litterservice.zone.mapper.AdmireMapper;
import com.litterservice.zone.service.AdmireService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdmireServiceImp implements AdmireService {

    @Autowired
    private AdmireMapper admireMapper;


    public Map addAdmire(Admire admire) {
        HashMap map = new HashMap();
        int add_success = this.admireMapper.addAdmire(admire.getShareid(), admire.getAdmireid());
        if(add_success == 1) {
            int alter_success = this.admireMapper.alterAdmireNum(admire.getShareid());
            if(alter_success == 1) {
                map.put("RESULT", "T");
                map.put("MESSAGE", "点赞成功");
            } else {
                map.put("RESULT", "F");
                map.put("MESSAGE", "点赞失败");
            }
        } else {
            map.put("RESULT", "F");
            map.put("MESSAGE", "上传失败");
        }

        return map;
    }

    public Map deleteAdmire(Admire admire) {
        HashMap map = new HashMap();
        int delete_success = this.admireMapper.deleteAdmire(admire.getShareid(), admire.getAdmireid());
        if(delete_success == 1) {
            int alter_success = this.admireMapper.deleteAdmireNum(admire.getShareid());
            if(alter_success == 1) {
                map.put("RESULT", "T");
                map.put("MESSAGE", "点赞取消成功");
            } else {
                map.put("RESULT", "F");
                map.put("MESSAGE", "点赞取消失败");
            }
        } else {
            map.put("RESULT", "F");
            map.put("MESSAGE", "上传失败");
        }

        return map;
    }

    public Map getSelfAdmire(User user) {
        HashMap map = new HashMap();
        List list = this.admireMapper.getSelfAdmire(user.getUserid());
        if(list != null) {
            map.put("RESULT", "T");
            map.put("MESSAGE", "查询成功");
            map.put("ROWS_DETAIL", list);
        } else {
            map.put("RESULT", "F");
            map.put("MESSAGE", "查询失败");
        }

        return map;
    }
}