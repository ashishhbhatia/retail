package com.retail.pojo.product;

import com.retail.enums.ProductType;

import java.util.Objects;

public class Mobile extends Product {
    private Integer ram;
    private Integer screenSize;
    private Integer memory;
    public Mobile(ProductType productType) {
        super(productType);
    }


    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Integer screenSize) {
        this.screenSize = screenSize;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mobile mobile = (Mobile) o;
        return Objects.equals(ram, mobile.ram) &&
                Objects.equals(screenSize, mobile.screenSize) &&
                Objects.equals(memory, mobile.memory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ram, screenSize, memory);
    }

}
