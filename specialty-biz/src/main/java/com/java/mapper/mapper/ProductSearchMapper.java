package com.java.mapper.mapper;

import com.java.model.ProductSearch;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * Created by hudiao on 2017/4/2.
 */
public interface ProductSearchMapper {
    /**
     * 查询
     */
    List<ProductSearch> find(ProductSearch productSearch);
}
