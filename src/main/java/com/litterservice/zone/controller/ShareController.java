package com.litterservice.zone.controller;


import com.litterservice.zone.bean.Share;
import com.litterservice.zone.bean.User;
import com.litterservice.zone.service.imp.ShareServiceImp;
import com.litterservice.zone.util.PrintLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Map;

@Controller
@RequestMapping({"/zone/action/v2"})
public class ShareController {

    @Autowired
    private ShareServiceImp shareServiceImp;
    //云服务器
    private String serverName = "49.234.95.239";
    //本地
    private String serverName2 = "localhost";


    @PostMapping({"/share_image"})
    @ResponseBody
    public Map shareImage(@RequestPart("image") MultipartFile image, HttpServletRequest request, @RequestParam("id") Integer id) {
        String name = id + image.getOriginalFilename();
        String basePath = request.getScheme() + "://" + this.serverName + ":" + request.getServerPort() + "/static/image/" + name;
        Map map = this.shareServiceImp.updateShareImage(id.intValue(), basePath);
//        File file = new File("C://zonrecs/image");
        File file = new File("/mywork/image");
        file.setWritable(true, false);
        if(!file.exists()) {
            file.mkdirs();
        }
        if(!image.isEmpty()) {
            try {
                String e = file + "/" + name;
                String MESSAGE;
                if(!(new File(e)).exists()) {
                    image.transferTo(new File(e));
                    MESSAGE = map.get("MESSAGE").toString();
                    map.put("MESSAGE", MESSAGE + ",保存成功");
                } else {
                    MESSAGE = map.get("MESSAGE").toString();
                    map.put("MESSAGE", MESSAGE + ",保存失败");
                }
            } catch (IOException var10) {
                var10.printStackTrace();
            }
        }

        return map;
    }

    @PostMapping({"/share"})
    @ResponseBody
    public Map share(@RequestBody Share share, HttpServletRequest request) {
        Map map = this.shareServiceImp.updateShare(share.getTitle(), share.getAdmire(), share.getAuthor(), share.getUpdate_time(), share.getCheckon());
        PrintLog.printLog(request.getRequestURL().toString(), share);
        return map;
    }

    @PostMapping({"/checkshare"})
    @ResponseBody
    public Map checkShare(@RequestBody Map request_map, HttpServletRequest request) {
        Map map = this.shareServiceImp.checkShare(Integer.parseInt(request_map.get("id").toString()), Integer.parseInt(request_map.get("checkon").toString()), (long)Integer.parseInt(request_map.get("userid").toString()));
        PrintLog.printLog(request.getRequestURL().toString(), request_map);
        return map;
    }

    @PostMapping({"/deleteshare"})
    @ResponseBody
    public Map deleteShare(@RequestBody Share share, HttpServletRequest request) {
        Map map = this.shareServiceImp.deleteShare(share.getId(), share.getAuthor());
        PrintLog.printLog(request.getRequestURL().toString(), share);
        return map;
    }

    @PostMapping({"/getallshare"})
    @ResponseBody
    public Map getAllShare(@RequestBody User user, HttpServletRequest request) {
        Map map = this.shareServiceImp.getAllShare(user);
        PrintLog.printLog(request.getRequestURL().toString(), user);
        return map;
    }

    @PostMapping({"/getchecked"})
    @ResponseBody
    public Map getAllCheckedShare(HttpServletRequest request) {
        Map map = this.shareServiceImp.getAllCheckedShare();
        PrintLog.printLog(request.getRequestURL().toString(), (Object)null);
        return map;
    }

    @PostMapping("/getselfshare")
    @ResponseBody
    public Map getSelfShare(@RequestBody Map request_map,HttpServletRequest request){
        Map map = this.shareServiceImp.getSelfShare(Long.parseLong(request_map.get("userid").toString()));
        PrintLog.printLog(request.getRequestURL().toString(),request_map);
        return map;
    }
}
