package com.learning.groovy.clazz

class Catch {
    def run() {
        try {
            'moo'.toLong()   // this will generate an exception
            assert false     // asserting that this point should never be reached
        } catch (e) {
            assert e in NumberFormatException
        }
    }

    static void main(String[] args) {
        def c = new Catch()
        c.run()
    }
}