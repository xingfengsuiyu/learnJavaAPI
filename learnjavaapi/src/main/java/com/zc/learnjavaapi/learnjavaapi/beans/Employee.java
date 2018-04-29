package com.zc.learnjavaapi.learnjavaapi.beans;

public class Employee {

    public static  Employee employee = new Employee();
    public static int age = 18;

    private String name;
    private byte addr;
    private int salary;

    private Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAddr() {
        return addr;
    }

    public void setAddr(byte addr) {
        this.addr = addr;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
