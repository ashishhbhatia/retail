package com.retail;

import com.retail.pojo.Bill;
import com.retail.pojo.Customer;
import com.retail.pojo.product.Product;

import java.util.List;

public interface Billing {
    void addProduct(Bill bill, Product product);
    Bill createBill(Bill bill);
    Bill startBill(Customer customer);
}
