package com.example.Electronics.entity;

import jakarta.persistence.*;

@Entity
@Table(/*name = "electronic"*/)
public class Electronics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    @Column
    private String productName;
    @Column
    private String productValue;

    public Electronics(){

    }

    public Electronics(String productName, String productValue) {
        this.productName = productName;
        this.productValue = productValue;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductValue() {
        return productValue;
    }

    public void setProductValue(String productValue) {
        this.productValue = productValue;
    }


    @Override
    public String toString() {
        return "Electronics{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productValue=" + productValue +
                '}';
    }
}
