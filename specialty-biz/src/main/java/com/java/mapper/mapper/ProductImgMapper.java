package com.java.mapper.mapper;

import com.java.model.product.ProductImg;
import com.java.model.product.ProductImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductImgMapper {
    int countByExample(ProductImgExample example);

    int deleteByExample(ProductImgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductImg record);

    int insertSelective(ProductImg record);

    List<ProductImg> selectByExample(ProductImgExample example);

    ProductImg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductImg record, @Param("example") ProductImgExample example);

    int updateByExample(@Param("record") ProductImg record, @Param("example") ProductImgExample example);

    int updateByPrimaryKeySelective(ProductImg record);

    int updateByPrimaryKey(ProductImg record);
}