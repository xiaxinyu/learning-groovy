package com.learning.groovy.closure


class Closure {
    static void main(String[] args) {
        def sayHello = { name -> "Hi,$name" }
        println(sayHello("summer"))
    }
}