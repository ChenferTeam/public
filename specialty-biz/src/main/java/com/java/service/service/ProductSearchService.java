package com.java.service.service;

import com.java.model.ProductSearch;

import java.util.List;


/**
 * Created by hudiao on 2017/4/2.
 */
public interface ProductSearchService {
    /**
     * 查询
     */
    List<ProductSearch> find(ProductSearch productSearch);
}
