package com.leaf.sevice;


import com.github.pagehelper.Page;
import com.leaf.model.TProduct;

import java.util.Map;

public interface TProductService {

    Page<Map<String, Object>> getTProductList(Integer currage, Integer pageSize);

    Integer deleteTProduct(Integer id);

    Integer updateTProduct(TProduct tProduct);

    Integer insertTProduct(TProduct tProduct);
}
