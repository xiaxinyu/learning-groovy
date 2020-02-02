package com.learning.groovy.gpath

class Person {
    String name
    int age
}

class GPathBase {
    static void main(String[] args) {
        def listOfMaps = [['a': 11, 'b': 12], ['a': 21, 'b': 22]]
        assert listOfMaps.a == [11, 21]
        assert listOfMaps*.a == [11, 21]


        def persons = [new Person(name: 'Hugo', age: 17), new Person(name: 'Sandra', age: 19)]
        assert [17, 19] == persons.age
        println(persons.age)
    }
}
