package com.learning.groovy.object

class Book {
    String title
}

class Person {
    String name
}

class MortgageLender {
    def borrowMoney() {
        "buy house"
    }
}


class MetaClassBase {
    static void main(String[] args) {
        //add dynamic method
        Book.metaClass.titleToUpperCase << { -> title.toUpperCase() }
        def b1 = new Book(title: "The Stand")
        assert "THE STAND" == b1.titleToUpperCase()

        //add dynamic property
        Book.metaClass.author = "summer"
        def b2 = new Book()
        assert "summer" == b2.author

        //add constructor method
        Book.metaClass.constructor << { String t -> new Book(title: t) }
        def b3 = new Book("Libra")
        assert b3.title == "Libra"

        //add static method
        Book.metaClass.static.create << { String t -> new Book(title: t) }
        def b4 = Book.create("jvm")
        assert b4.title == "jvm"

        //borrow method
        def leader = new MortgageLender()
        Person.metaClass.buyHouse = leader.&borrowMoney

        def p1 = new Person()
        assert "buy house" == p1.buyHouse()
    }
}
