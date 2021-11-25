package com.litterservice.zone.service;

import com.litterservice.zone.bean.User;

import java.util.Map;

public interface ShareService {
    Map updateShareImage(int id, String imagepath);
    Map updateShare(String title, int admire, int author, String update_time, int checkon);
    Map checkShare(int id, int checkon, long userid);
    Map deleteShare(int id, int author);
    Map getAllShare(User user);
    Map getAllCheckedShare();
    Map getSelfShare(long userid);
}