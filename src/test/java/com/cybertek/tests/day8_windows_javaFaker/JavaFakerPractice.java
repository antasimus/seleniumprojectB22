package com.cybertek.tests.day8_windows_javaFaker;

import org.testng.annotations.Test;
import com.github.javafaker.Faker;

public class JavaFakerPractice {

    @Test
    public void test1(){

        Faker faker = new Faker();

        String fullName = faker.name().fullName();

        System.out.println("fullName = " + fullName);
    }
}
