package com.example.dot.demo.test;

class Customer {
    private final String name;
    private final String address;

    Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }


    @Override
    public String toString() {
        return "com.example.dot.demo.test.Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}