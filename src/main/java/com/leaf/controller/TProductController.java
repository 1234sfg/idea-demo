package com.leaf.controller;


import com.github.pagehelper.Page;
import com.leaf.model.TProduct;
import com.leaf.sevice.TProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


@RestController
public class TProductController {
    @Autowired
    private TProductService tProductService;
//    增
    @PostMapping("insertTProduct")
    public String insertTProduct(@RequestBody TProduct tProduct){
        Integer count =tProductService.insertTProduct(tProduct);
        return count.toString();
    }
//    删/
    @DeleteMapping("/deleteTProduct/{id}")
    public String deleteTProduct(@PathVariable Integer id){
        Integer count = tProductService.deleteTProduct(id);
        return count.toString();
    }
//    改
    @PutMapping("/updateTProduct")
    public String updateTProduct(@RequestBody TProduct tProduct){
        Integer count = tProductService.updateTProduct(tProduct);
        return count.toString();
    }
//    查/
    @GetMapping("/getTProductList")
    public Page<Map<String,Object>> getTProductList(Integer currage , Integer pageSize){

        Page<Map<String,Object>> page = tProductService.getTProductList(currage,pageSize);
        return  page;
    }

}
