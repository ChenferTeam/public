package com.java.service.impl;

import com.java.mapper.mapper.ProductSearchMapper;
import com.java.model.ProductSearch;
import com.java.service.service.ProductSearchService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hudiao on 2017/4/2.
 */
@Service
public class ProductSearchServiceImpl implements ProductSearchService {
    @Autowired
    private ProductSearchMapper productSearchMapper;
    /**
     * 查询
     * */
    public List<ProductSearch> find(ProductSearch productSearch) {
       List<ProductSearch> productSearchesList = productSearchMapper.find(productSearch);
        return productSearchesList;
    }
}
