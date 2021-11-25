package com.litterservice.zone.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdmireMapper {
    int addAdmire(int shareid, int admireid);
    int alterAdmireNum(int id);
    int deleteAdmire(int shareid, int admireid);
    int deleteAdmireNum(int id);
    List getSelfAdmire(long userid);
}
