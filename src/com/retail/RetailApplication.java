package com.retail;

import com.retail.pojo.Bill;
import com.retail.pojo.Customer;
import com.retail.pojo.product.Product;
import com.retail.service.*;

import java.util.ArrayList;
import java.util.List;

public class RetailApplication {

    public RetailApplication(){
        customerService = new CustomerServiceImpl();
        retailPrinter =  new RetailPrinter();
        productService =  new ProductServiceImpl();
    }
    CustomerService customerService;
    ProductService productService;
    RetailPrinter retailPrinter;

    public static void main(String[] args){
        RetailApplication retailApplication = new RetailApplication();
        retailApplication.checkout();;
    }

    public void checkout(){

        Billing retailOutletBilling = new RetailOutletBilling();
        Customer customer = customerService.getCustomer(1);
        Bill bill = retailOutletBilling.startBill(customer);
        List<Product>  productList = scanProducts();
        for(Product product : productList){
            retailOutletBilling.addProduct(bill,product);
        }
        bill = retailOutletBilling.createBill(bill);
        printBill(bill);
    }

    public void printBill(Bill bill){

        retailPrinter.printBill(bill);

    }


    public List<Product> scanProducts(){

        List<Product> productList = new ArrayList<>();
        productList.add(productService.getProduct(1));
        productList.add(productService.getProduct(2));
        productList.add(productService.getProduct(2));
        productList.add(productService.getProduct(3));
        productList.add(productService.getProduct(3));
        return productList;
    }
}
