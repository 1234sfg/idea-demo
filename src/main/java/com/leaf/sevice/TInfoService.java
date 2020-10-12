package com.leaf.sevice;

import com.github.pagehelper.Page;
import com.leaf.model.TInfo;

import java.util.List;
import java.util.Map;


public interface TInfoService {

    Integer saveTInfo(TInfo tInfo);

    Integer updateTInfo(TInfo tInfo);

    Integer deleteTInfo(Integer id);

    List<TInfo> getTInfoList();

    List<TInfo> getTInfosBySome(String some);


    List<TInfo> getTInfosLimit(Integer currPage, Integer pageSize);

    Page<Map<String, Object>> getTInfoAndProductLimit(Integer currPage, Integer pageSize);
}
