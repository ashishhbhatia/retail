package com.retail.service;

import com.retail.enums.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceImplTest {

    @Test
    void getTaxValue() {
        CustomerService customerService = new CustomerServiceImpl();
        Assertions.assertEquals(customerService.getCustomer(1).getName(),"Ashish");

    }

}