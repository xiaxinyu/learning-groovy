package com.learning.groovy.list

class ListTest {
    static void main(String[] args) {
        def l1 = [1, 2, 3];
        l1.eachWithIndex { int entry, int i ->
            println("${i}: ${entry}")
        }

        // find first element
        def l1_r1 = l1.find({ it > 1 })
        println(l1_r1)

        // find all elements
        def l1_r2 = l1.findAll({ it > 1 })
        println(l1_r2)

        // sum
        def sum1 = l1.sum();
        println("sum=${sum1}")

        assert l1.every({ it < 4 })
        assert l1.any { it > 2 }

        assert l1.join('-') == '1-2-3'

        assert l1.inject(0) { count, item -> count + item } == 6

        assert l1.max() == 3
        assert l1.min() == 1
    }
}
