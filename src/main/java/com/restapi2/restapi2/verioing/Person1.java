package com.restapi2.restapi2.verioing;

public class Person1 {
    private String name;

    public Person1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                '}';
    }
}
