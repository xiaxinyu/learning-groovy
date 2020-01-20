package com.learning.groovy.clazz

class PersonConstructor {
    String name
    Integer age

    PersonConstructor(name, age) {
        this.name = name
        this.age = age
    }

    @Override
    public String toString() {
        return "PersonConstructor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
