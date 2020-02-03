package com.learning.groovy.classloader

def cycle(def number) {
    for (i in 0..<number) {
        println(i)
    }
}

static void main(String[] args) {
    cycle(5)
}