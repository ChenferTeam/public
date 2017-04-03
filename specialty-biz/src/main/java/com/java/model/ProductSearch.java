package com.java.model;

/**
 * Created by hudiao on 2017/4/2.
 */
public class ProductSearch {
    private int id;
    private  String product_name;
    private  String description;
    private  String product_place;
    private String product_price;
    private String product_sales_volume;
    private String product_image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProduct_place() {
        return product_place;
    }

    public void setProduct_place(String product_place) {
        this.product_place = product_place;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public String getProduct_sales_volume() {
        return product_sales_volume;
    }

    public void setProduct_sales_volume(String product_sales_volume) {
        this.product_sales_volume = product_sales_volume;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }
}
