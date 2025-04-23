package com.inheritance;

import javax.xml.catalog.Catalog;

public class AnimalTest {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "멍멍이";

        Cat cat = new Cat();
        cat.name = "양아치";
        cat.bark();
    }
}
