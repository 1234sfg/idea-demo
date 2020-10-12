package com.leaf.mapper;

import com.github.pagehelper.Page;
import com.leaf.model.TInfo;

import java.util.List;
import java.util.Map;

public interface TInfoMapper {

    Integer saveTInfo(TInfo tInfo);

    Integer updateTInfo(TInfo tInfo);

    Integer deleteTInfo(Integer id);

    List<TInfo> getTInfoList();

    List<TInfo> getTInfosBySome(String some);

    Page<Map<String, Object>> getTInfoAndProductLimit();
}
