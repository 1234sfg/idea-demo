package com.leaf.sevice.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leaf.mapper.TInfoMapper;
import com.leaf.model.TInfo;
import com.leaf.sevice.TInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



//TInfoService的实现类TInfoServiceImpl
@Slf4j
@Service

public class TInfoServiceImpl implements TInfoService {
    @Autowired
    private TInfoMapper tInfoMapper;

    @Override
    public Integer saveTInfo(TInfo tInfo) {
        Integer count = tInfoMapper.saveTInfo(tInfo);
        return count;
    }
    @Override
    public Integer updateTInfo(TInfo tInfo) {
        Integer count = tInfoMapper.updateTInfo(tInfo);
        return count;
    }

    @Override
    public Integer deleteTInfo(Integer id) {
        Integer count= tInfoMapper.deleteTInfo(id);
        return count;
    }

    @Override
    public List<TInfo> getTInfoList() {
        List<TInfo>  tInfos= tInfoMapper.getTInfoList();
        return tInfos;
    }

    @Override
    public List<TInfo> getTInfosBySome(String some) {
         List<TInfo> tInfos = tInfoMapper.getTInfosBySome(some);
        return tInfos;
    }

    @Override
    public List<TInfo> getTInfosLimit(Integer currPage, Integer pageSize) {
        PageHelper.startPage(currPage,pageSize);
        List<TInfo>  tInfos= tInfoMapper.getTInfoList();
        return tInfos;
    }

    @Override
    public Page<Map<String, Object>> getTInfoAndProductLimit(Integer currPage, Integer pageSize) {
        PageHelper.startPage(currPage,pageSize);
        Page<Map<String,Object>> page = tInfoMapper.getTInfoAndProductLimit();
        return page;
    }


}
