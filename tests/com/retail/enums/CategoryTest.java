package com.retail.enums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    @Test
    void getTaxValue() {
        Category categoryA = Category.A;
        Assertions.assertEquals(categoryA.getTaxValue(),10);
        Category categoryB = Category.B;
        Assertions.assertEquals(categoryB.getTaxValue(),20);
        Category categoryC = Category.C;
        Assertions.assertEquals(categoryC.getTaxValue(),0);

    }
}