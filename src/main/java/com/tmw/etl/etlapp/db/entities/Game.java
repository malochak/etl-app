package com.tmw.etl.etlapp.db.entities;

import javax.persistence.*;

@Entity(name = "Game")
@Table(name = "Games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String productId;
    private String productName;
    private String productCategory;
    private String productPrice;
    private String productImageUrl;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    @Override
    public String toString() {
        return "Game{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", productImageUrl='" + productImageUrl + '\'' +
                '}';
    }
}
