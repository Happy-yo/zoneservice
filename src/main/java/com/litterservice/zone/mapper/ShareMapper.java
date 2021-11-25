package com.litterservice.zone.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShareMapper {
    int addShareImage(int id, String imagepath);
    int addShare(String title, int admire, int author, String update_time, int checkon);
    int checkShare(int id, int checkon);
    int deleteShare(int id, int author);
    List getAllShare();
    List getAllCheckedShare();
    List getSelfShare(long userid);
}
