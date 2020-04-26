package com.retail.service;

import com.retail.enums.CustomerType;
import com.retail.pojo.Customer;
import com.retail.pojo.RetailCustomer;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public Customer getCustomer(Integer custId) {
        //TODO get customer from DB
        Customer customer = new RetailCustomer();
        customer.setName("Ashish");
        customer.setAddress("Pune");
        customer.setContactNumber("9960200550");
        customer.setCustomerType(CustomerType.NORMAL);
        customer.setCustomerId(1);
        return customer;
    }

    @Override
    public Customer saveCustomer(CustomerType customerType, String name, String contact, String address) {
        //TODO save customer in DB
        return null;
    }
}
