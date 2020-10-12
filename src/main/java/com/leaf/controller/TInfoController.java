package com.leaf.controller;


import com.github.pagehelper.Page;
import com.leaf.model.TInfo;

import com.leaf.sevice.TInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController

public class TInfoController {

//    自动装载tInfoService的其中一个实现类
    @Autowired
    private TInfoService tInfoService;

//  指定加载其中一个实现类
//@Autowired
//@Qualifier("tInfoServiceImpl")
//private TInfoService tInfoServiceImpl;



    @PostMapping("/saveTInfo")
    public String saveTInfo (@RequestBody TInfo tInfo){
        Integer count = tInfoService.saveTInfo(tInfo);
        return count.toString();
    }
    @PutMapping("/updateTInfo")
    public String updateTInfo (@RequestBody TInfo tInfo){
        Integer count = tInfoService.updateTInfo(tInfo);
        return count.toString();
    }
    @DeleteMapping("/deleteTInfo/{id}")
    public String deleteTInfo (@PathVariable Integer id){
        Integer count = tInfoService.deleteTInfo(id);
        return count.toString();
    }
    @GetMapping("/getTInfoList")
    public List getTInfoList (){
        List<TInfo>  tInfos= tInfoService.getTInfoList();
        return tInfos;
    }
    @GetMapping("/getTInfosBySome")
    public  List getTInfosBySome(@RequestParam String some){
        List<TInfo> tInfos = tInfoService.getTInfosBySome(some);
        return tInfos;
    }
    @GetMapping("/getTInfosLimit")
    public List<TInfo> getTInfosLimit (@RequestParam Integer currPage, Integer pageSize){
        List<TInfo> tInfos= tInfoService.getTInfosLimit(currPage,pageSize);
        return tInfos;
    }
    @GetMapping("/getTInfoAndProductLimit")
    public Page<Map<String,Object>> getTInfoAndProductLimit (@RequestParam Integer currPage, Integer pageSize){
        Page<Map<String,Object>> page = tInfoService.getTInfoAndProductLimit(currPage,pageSize);

        return page;
    }
}
