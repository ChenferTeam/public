package com.java.model.product;

public class ProductType {
    private Integer id;

    private String upTypeId;

    private String typeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUpTypeId() {
        return upTypeId;
    }

    public void setUpTypeId(String upTypeId) {
        this.upTypeId = upTypeId == null ? null : upTypeId.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }
}