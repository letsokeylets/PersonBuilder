package org.example;

public class PersonBuilder {
    protected String name;
    protected String surnameme;
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surnameme = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }


    public Person build() {
        if (name == null || surnameme == null) {
            throw new IllegalStateException("Не хватает обязательных полей");
        }
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Введены недопустимые значения возраста");
        }
        Person person = new Person(name, surnameme, age);
        if (address != null) {
            person.setAddress(address);
        }
        return person;
    }
}
