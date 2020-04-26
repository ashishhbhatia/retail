package com.retail.service;

import com.retail.pojo.Bill;

public class RetailPrinter implements Printer {

    @Override
    public void printBill(Bill bill) {
        bill.printBill();
    }
}
