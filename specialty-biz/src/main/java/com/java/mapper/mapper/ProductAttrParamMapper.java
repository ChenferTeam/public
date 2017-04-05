package com.java.mapper.mapper;

import com.java.model.product.ProductAttrParam;
import com.java.model.product.ProductAttrParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductAttrParamMapper {
    int countByExample(ProductAttrParamExample example);

    int deleteByExample(ProductAttrParamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductAttrParam record);

    int insertSelective(ProductAttrParam record);

    List<ProductAttrParam> selectByExample(ProductAttrParamExample example);

    ProductAttrParam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductAttrParam record, @Param("example") ProductAttrParamExample example);

    int updateByExample(@Param("record") ProductAttrParam record, @Param("example") ProductAttrParamExample example);

    int updateByPrimaryKeySelective(ProductAttrParam record);

    int updateByPrimaryKey(ProductAttrParam record);
}