
package com.example.apicallingforretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Product implements Serializable {

    @SerializedName("products")
    @Expose
    private List<Product__1> products;
    @SerializedName("total")
    @Expose
    private int total;
    @SerializedName("skip")
    @Expose
    private int skip;
    @SerializedName("limit")
    @Expose
    private int limit;
    private final static long serialVersionUID = 7883749967155403556L;

    public List<Product__1> getProducts() {
        return products;
    }

    public void setProducts(List<Product__1> products) {
        this.products = products;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSkip() {
        return skip;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "products=" + products +
                ", total=" + total +
                ", skip=" + skip +
                ", limit=" + limit +
                '}';
    }
}
