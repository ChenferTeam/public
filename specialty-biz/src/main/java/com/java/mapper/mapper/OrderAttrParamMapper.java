package com.java.mapper.mapper;

import com.java.model.order.OrderAttrParam;
import com.java.model.order.OrderAttrParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderAttrParamMapper {
    int countByExample(OrderAttrParamExample example);

    int deleteByExample(OrderAttrParamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderAttrParam record);

    int insertSelective(OrderAttrParam record);

    List<OrderAttrParam> selectByExample(OrderAttrParamExample example);

    OrderAttrParam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderAttrParam record, @Param("example") OrderAttrParamExample example);

    int updateByExample(@Param("record") OrderAttrParam record, @Param("example") OrderAttrParamExample example);

    int updateByPrimaryKeySelective(OrderAttrParam record);

    int updateByPrimaryKey(OrderAttrParam record);
}