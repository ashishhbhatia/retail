package com.retail.pojo;

import java.util.Random;

public class RetailBill extends Bill {
    @Override
    public Double getTotalBill() {
         return this.getTotalCost()+this.getTotalTax();
    }

    public RetailBill()
    {
        Random rand = new Random();

        // Generate random integers in range 0 to 999
        this.setBillNo(rand.nextInt(10000));

    }
    @Override
    public void printBill() {
        System.out.println("-----Retail Outlet------");
        System.out.println("Bill No: " + this.getBillNo());
        System.out.println("Bill Date: " + this.getBillingDate());
        System.out.println("Customer Details: " + this.getCustomer().printCustomer());
        System.out.println("---Items purchased---");
        System.out.println("---Category-----Item------Cost----tax-");

        this.getProductList().forEach(System.out::println);

        System.out.println("Total Cost:"+this.getTotalCost());
        System.out.println("Total tax:"+this.getTotalTax());
        System.out.println("Total Bill:"+this.getTotalBill());

    }

}
