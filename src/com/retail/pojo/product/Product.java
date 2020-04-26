package com.retail.pojo.product;

import com.retail.enums.ProductType;

import java.util.Objects;


public abstract class Product {
    private Integer productId;
    private ProductType productType;
    private String brandName;
    private Long price;

    public Product(ProductType productType){
        this.productType = productType;
    }
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Long getPrice() {
        return price;
    }

    public Double getSalesTax(){
        return Double.valueOf(price *  (productType.getCategory().getTaxValue()/100));
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productId, product.productId) &&
                productType == product.productType &&
                Objects.equals(brandName, product.brandName) &&
                Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productType, brandName, price);
    }

    @Override
    public String toString() {
        return  productType +
                "----" + brandName +
                "----" + price +
        "----" + getSalesTax() ;
    }
}
