package com.wenjing.http;

import java.util.Objects;

public class ProductData {
    private String color;
    private String capacity;

    public ProductData() {
    }

    public ProductData(String color, String capacity) {
        this.color = color;
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductData)) return false;
        ProductData that = (ProductData) o;
        return Objects.equals(color, that.color) && Objects.equals(capacity, that.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, capacity);
    }
}
