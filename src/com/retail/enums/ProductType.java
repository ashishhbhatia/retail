package com.retail.enums;

/*
Enum class with PRODUCT TYPE
 */
public enum ProductType {
    ELECTRONICS(Category.A),CLOTHES(Category.B),FOOD(Category.C),CONSUMABLES(Category.A);
    private Category category;

    ProductType(Category category){
        this.category = category;
    }

    public Category getCategory(){
        return category;
    }

}
