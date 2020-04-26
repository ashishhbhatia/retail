package com.retail;

import com.retail.enums.CustomerType;
import com.retail.pojo.Bill;
import com.retail.pojo.Customer;
import com.retail.pojo.RetailCustomer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetailOutletBillingTest {

    @Test
    void startBill() {
        Customer customer = new RetailCustomer();
        customer.setCustomerId(1);
        customer.setCustomerType(CustomerType.NORMAL);
        customer.setName("Ashish");
        customer.setContactNumber("9960200550");

        Billing retailOutletBilling = new RetailOutletBilling();
        Assertions.assertEquals((int) retailOutletBilling.startBill(customer).getCustomer().getCustomerId(), 1);
    }
    }