package com.retail.pojo;

import com.retail.pojo.product.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public abstract class Bill {
    private List<Product> productList;
    private Customer customer;
    private Integer billNo;
    private Date billingDate;
    private Double totalCost;
    private Double totalTax;
    private Long discount = 0l;


    public abstract Double getTotalBill();
    public abstract void printBill();


    public void addProduct(Product product){
        if(productList==null)
            productList = new ArrayList<>();
        productList.add(product);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Integer getBillNo() {
        return billNo;
    }

    public void setBillNo(Integer billNo) {
        this.billNo = billNo;
    }

    public Date getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(Double totalTax) {
        this.totalTax = totalTax;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill bill = (Bill) o;
        return Objects.equals(productList, bill.productList) &&
                Objects.equals(billNo, bill.billNo) &&
                Objects.equals(billingDate, bill.billingDate) &&
                Objects.equals(totalCost, bill.totalCost) &&
                Objects.equals(totalTax, bill.totalTax) &&
                Objects.equals(discount, bill.discount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productList, billNo, billingDate, totalCost, totalTax, discount);
    }


}
