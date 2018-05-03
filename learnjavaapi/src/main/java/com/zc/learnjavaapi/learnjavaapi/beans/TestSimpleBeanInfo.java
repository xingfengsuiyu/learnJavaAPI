package com.zc.learnjavaapi.learnjavaapi.beans;

import java.beans.SimpleBeanInfo;

public class TestSimpleBeanInfo {

    public static void main(String[] args) {
        SimpleBeanInfo simpleBeanInfo = new SimpleBeanInfo();
        System.out.println(simpleBeanInfo.getAdditionalBeanInfo());
    }
}
