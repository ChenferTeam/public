package com.java.mapper.mapper;

import com.java.model.product.ProductAttr;
import com.java.model.product.ProductAttrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductAttrMapper {
    int countByExample(ProductAttrExample example);

    int deleteByExample(ProductAttrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductAttr record);

    int insertSelective(ProductAttr record);

    List<ProductAttr> selectByExample(ProductAttrExample example);

    ProductAttr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductAttr record, @Param("example") ProductAttrExample example);

    int updateByExample(@Param("record") ProductAttr record, @Param("example") ProductAttrExample example);

    int updateByPrimaryKeySelective(ProductAttr record);

    int updateByPrimaryKey(ProductAttr record);
}