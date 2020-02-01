package com.learning.groovy.closure


class ClosureTest {
    static void main(String[] args) {
        def sayHello = { name -> "Hi,$name" }
        println(sayHello("summer"))

        def c = {
            println it
        }
        c.call('text1')
        c('text2')

        def c2 = { a, b ->
            println a
            println b
        }
        c2(1, 2)


        def func = { text, Closure closure ->
            println text
            closure.call()
        }

        func('summer', { println('winner') })
    }
}