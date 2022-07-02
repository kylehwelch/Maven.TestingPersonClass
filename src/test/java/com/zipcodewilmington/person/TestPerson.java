package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


//    @Test
//    public void testConstructorWithNameAndAge() {
//        // Given
//        Integer expectedAge = 5;
//        String expectedName = "Leon";
//
//        // When
//        Person person = new Person(expectedName, expectedAge);
//
//        // Then
//        Integer actualAge = person.getAge();
//        String actualName = person.getName();
//
//        Assert.assertEquals(expectedAge, actualAge);
//        Assert.assertEquals(expectedName, actualName);
//    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetLastName() {
        // Given
        Person person = new Person();
        String expected = "Jenkins";

        // When
        person.setLastName(expected);

        // Then
        String actual = person.getLastName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEyeColor() {
        // Given
        Person person = new Person();
        String expected = "Blue";

        // When
        person.setEyeColor(expected);

        // Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        Integer expected = 100;
        // When
        person.setHeight(expected);

        // Then
        Integer actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetIQ() {
        // Given
        Person person = new Person();
        Integer expected = 150;

        // When
        person.setIQ(expected);

        // Then
        Integer actual = person.getIQ();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetYearsOfSchool() {
        // Given
        Person person = new Person();
        Integer expected = 12;

        // When
        person.setYearsOfSchool(expected);

        // Then
        Integer actual = person.getYearsOfSchool();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAll() {
        // Given
        Integer expectedAge = 22;
        String expectedName = "Harold";
        String expectedLastName = "McFarty";
        String expectedEyeColor = "Green";
        Integer expectedHeight = 88;
        Integer expectedIQ = 119;
        Integer expectedYearsOfSchool = 14;

        // When
        Person person = new Person(expectedName, expectedAge, expectedLastName, expectedEyeColor, expectedHeight, expectedIQ, expectedYearsOfSchool);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        String actualLastName = person.getLastName();
        String actualEyeColor = person.getEyeColor();
        Integer actualHeight = person.getHeight();
        Integer actualIQ = person.getIQ();
        Integer actualYearsOfSchool = person.getYearsOfSchool();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedIQ, actualIQ);
        Assert.assertEquals(expectedYearsOfSchool, actualYearsOfSchool);
    }
}
