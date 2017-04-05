package com.java.model.product;

public class ProductAttrParam {
    private Integer id;

    private Integer productAttrId;

    private String paramName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductAttrId() {
        return productAttrId;
    }

    public void setProductAttrId(Integer productAttrId) {
        this.productAttrId = productAttrId;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }
}