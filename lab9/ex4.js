package com.deloitte.lab9.ex4;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class MethodReferenceDemo {
    public static void main(String[] args) {
        PersonFactory factory = Person::new; // Method reference
        Person person = factory.create("John Doe");
        System.out.println("Person Name: " + person.getName());
    }

    interface PersonFactory {
        Person create(String name);
    }
}
