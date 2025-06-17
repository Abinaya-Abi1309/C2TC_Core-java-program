//Program to define Person entity
package com.tnsif.daythree.scannerdemo;

public class Person {
    //Data members
    private String name;
    private int income;
    private String gender;
    private int age;
    private int tax;

    //Getter and Setters
    public int getTAX() {
        return tax;
    }

    public void setTAX(int tax) {
        this.tax = tax;
    }

    public String getNAME() {
        return name;
    }

    public void setNAME(String name) {
        this.name = name;
    }

    public int getINCOME() {
        return income;
    }

    public void setINCOME(int income) {
        this.income = income;
    }

    public String getGENDER() {
        return gender;
    }

    public void setGENDER(String gender) {
        this.gender = gender;
    }

    public int getAGE() {
        return age;
    }

    public void setAGE(int age) {
        this.age = age;
    }

    //Object class method to return string representation of Person object
    @Override
    public String toString() {
        return "Person [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", tax=" + tax + "]";
    }
}