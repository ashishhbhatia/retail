package com.retail.pojo;

import com.retail.enums.CustomerType;

import java.util.Objects;

public abstract class Customer {

    private CustomerType customerType;
    private String name;
    private Integer customerId;
    private String contactNumber;
    private String address;

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerType == customer.customerType &&
                Objects.equals(name, customer.name) &&
                Objects.equals(customerId, customer.customerId) &&
                Objects.equals(contactNumber, customer.contactNumber) &&
                Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerType, name, customerId, contactNumber, address);
    }

    public String printCustomer() {
        return "Customer{" +
                ", name='" + name + '\'' +
                ", customerId=" + customerId +
                ", contactNumber='" + contactNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    @Override
    public String toString() {
        return "Customer{" +
                "customerType=" + customerType +
                ", name='" + name + '\'' +
                ", customerId=" + customerId +
                ", contactNumber='" + contactNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
