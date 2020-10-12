package com.leaf.sevice.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.leaf.mapper.TProductDAO;
import com.leaf.model.TProduct;
import com.leaf.sevice.TProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Slf4j
@Service

public class TProductServiceImpl  implements TProductService {
    @Autowired
    private TProductDAO tProductDAO;

//删
    @Override
    public Integer deleteTProduct(Integer id) {
        Integer count =tProductDAO.deleteTProduct(id);
        return count;
    }
//改
    @Override
    public Integer updateTProduct(TProduct tProduct) {
        Integer count =  tProductDAO.updateTProduct(tProduct);
        return count;
    }

    @Override
    public Integer insertTProduct(TProduct tProduct) {
        Integer count = tProductDAO.insertTProduct(tProduct);
        return count;
    }

    //    查
    @Override
    public Page<Map<String, Object>> getTProductList(@RequestParam Integer currage, Integer pageSize) {
        PageHelper.startPage(currage,pageSize);
        Page<Map<String,Object>> page = tProductDAO.getTProductList();
        return  page;
    }


}
