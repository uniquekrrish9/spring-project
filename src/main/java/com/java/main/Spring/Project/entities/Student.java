package com.java.main.Spring.Project.entities;

public class Student {
    private Integer id;
    private String name;
//    private String address;
    private double fee;

    private Address address;

    public Student() {
    }

    public Student(Integer id, String name, double fee,Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.fee = fee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
