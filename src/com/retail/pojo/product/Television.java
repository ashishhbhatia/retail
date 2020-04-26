package com.retail.pojo.product;

import com.retail.enums.ProductType;

import java.util.Objects;

public class Television extends Product {

    private Integer size;
    private Boolean uhd;
    public Television(ProductType productType) {
        super(productType);
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Boolean isUhd() {
        return uhd;
    }

    public void setUhd(Boolean uhd) {
        this.uhd = uhd;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Television that = (Television) o;
        return Objects.equals(size, that.size) &&
                Objects.equals(uhd, that.uhd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size, uhd);
    }

    @Override
    public String toString() {
        return "Televisions{" +
                "size=" + size +
                ", uhd=" + uhd +
                '}';
    }
}
