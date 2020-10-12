package com.leaf.mapper;


import com.github.pagehelper.Page;
import com.leaf.model.TProduct;

import java.util.Map;

public interface TProductDAO {




    Integer deleteTProduct(Integer id);

    Integer updateTProduct(TProduct tProduct);


    Page<Map<String, Object>> getTProductList();


    Integer insertTProduct(TProduct tProduct);
}
