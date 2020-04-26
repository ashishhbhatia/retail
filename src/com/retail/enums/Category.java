package com.retail.enums;

/*
Enum class with Tax category and its tax percentage
 */
public enum Category {
    A(10),B(20),C(0);
    private float tax;

    Category(float tax){
        this.tax = tax;
    }

    public float getTaxValue(){
        return tax;
    }
}
