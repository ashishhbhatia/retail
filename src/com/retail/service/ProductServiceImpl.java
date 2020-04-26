package com.retail.service;

import com.retail.enums.ProductType;
import com.retail.pojo.product.*;

public class ProductServiceImpl implements ProductService {
    public Product getProduct(Integer productId){
        //TODU get product from Database
        Product product = null;
       if(productId == 1) {
           product = new Mobile(ProductType.ELECTRONICS);
           product.setBrandName("Nokia");
           product.setPrice(100L);
           product.setProductId(1);
           ((Mobile) product).setMemory(256);
           ((Mobile) product).setRam(4);
           ((Mobile) product).setScreenSize(6);
       }
       else if (productId == 2){
           product = new Food(ProductType.FOOD);
           product.setBrandName("Nestle");
           product.setPrice(10L);
           product.setProductId(2);
       }
       else if (productId == 3){
           product = new Jeans(ProductType.CLOTHES);
           product.setBrandName("Lewis");
           product.setPrice(1000L);
           product.setProductId(3);
       }
        return product;
    }
}
