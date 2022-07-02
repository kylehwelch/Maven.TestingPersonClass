package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String lastName;
    private String eyeColor;
    private int height;
    private int IQ;
    private int yearsOfSchool;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.lastName = "";
        this.eyeColor = "";
        this.height = Integer.MAX_VALUE;
        this.IQ = Integer.MAX_VALUE;
        this.yearsOfSchool = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, String lastName, String eyeColor, int height, int IQ, int yearsOfSchool) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
        this.eyeColor = eyeColor;
        this.height = height;
        this.IQ = IQ;
        this.yearsOfSchool = yearsOfSchool;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getAge() {
        return this.age = age;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public String getLastName () {
        return this.lastName = lastName;
    }

    public void setEyeColor (String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getEyeColor () {
        return this.eyeColor = eyeColor;
    }

    public void setHeight (int height) {
        this.height = height;
    }

    public int getHeight () {
        return this.height = height;
    }

    public void setIQ (int IQ) {
        this.IQ = IQ;
    }

    public int getIQ () {
        return this.IQ = IQ;
    }

    public void setYearsOfSchool (int yearsOfSchool) {
        this.yearsOfSchool = yearsOfSchool;
    }

    public int getYearsOfSchool () {
        return this.yearsOfSchool = yearsOfSchool;
    }
}
