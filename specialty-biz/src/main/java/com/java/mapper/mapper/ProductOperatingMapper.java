package com.java.mapper.mapper;

import com.java.model.product.ProductOperating;
import com.java.model.product.ProductOperatingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductOperatingMapper {
    int countByExample(ProductOperatingExample example);

    int deleteByExample(ProductOperatingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductOperating record);

    int insertSelective(ProductOperating record);

    List<ProductOperating> selectByExample(ProductOperatingExample example);

    ProductOperating selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductOperating record, @Param("example") ProductOperatingExample example);

    int updateByExample(@Param("record") ProductOperating record, @Param("example") ProductOperatingExample example);

    int updateByPrimaryKeySelective(ProductOperating record);

    int updateByPrimaryKey(ProductOperating record);
}