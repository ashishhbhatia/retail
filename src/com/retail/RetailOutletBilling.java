package com.retail;

import com.retail.pojo.Bill;
import com.retail.pojo.Customer;
import com.retail.pojo.RetailBill;
import com.retail.pojo.product.Product;

import java.util.Date;

public class RetailOutletBilling implements Billing {

    @Override
    public void addProduct(Bill bill, Product product) {
        bill.addProduct(product);
    }

    @Override
    public Bill createBill(Bill bill) {
        bill.setBillingDate(new Date());
        bill.setTotalCost(bill.getProductList().stream().mapToDouble(p -> p.getPrice()).sum());
        bill.setTotalTax(bill.getProductList().stream().mapToDouble(p-> p.getSalesTax()).sum());
        return bill;
    }

    @Override
    public Bill startBill(Customer customer) {
        Bill bill = new RetailBill();
        bill.setCustomer(customer);
        return bill;
    }


}
