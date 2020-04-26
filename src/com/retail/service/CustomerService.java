package com.retail.service;

import com.retail.enums.CustomerType;
import com.retail.pojo.Customer;
import com.retail.pojo.product.Product;

public interface CustomerService {
    Customer getCustomer(Integer custId);
    Customer saveCustomer(CustomerType customerType,String name, String contact,String address);

}
