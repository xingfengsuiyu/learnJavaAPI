package com.zc.learnjavaapi.learnjavaapi.beans;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;

public class TestPropertyDescriptor {

    public static void main(String[] args) throws IntrospectionException {
        Employee employee = new Employee();
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("name",Employee.class);
    }
}
