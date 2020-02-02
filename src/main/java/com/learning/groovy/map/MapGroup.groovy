package com.learning.groovy.map

class MapGroup {
    static void main(String[] args) {
        // Group by class type
        def temp = ['a', 7, 'b', [2, 3]].groupBy {
            it.class
        }
        println(temp)
        assert temp == [(String)   : ['a', 'b'],
                        (Integer)  : [7],
                        (ArrayList): [[2, 3]]
        ]

        // Group by
        def temp1 = [
                [name: 'Clark', city: 'London'], [name: 'Sharma', city: 'London'],
                [name: 'Maradona', city: 'LA'], [name: 'Zhang', city: 'HK'],
                [name: 'Ali', city: 'HK'], [name: 'Liu', city: 'HK'],
        ].groupBy {
            it.city
        }
        println(temp1.getClass())
        println(temp1)

        assert temp1 == [
                London: [[name: 'Clark', city: 'London'],
                         [name: 'Sharma', city: 'London']],
                LA    : [[name: 'Maradona', city: 'LA']],
                HK    : [[name: 'Zhang', city: 'HK'],
                         [name: 'Ali', city: 'HK'],
                         [name: 'Liu', city: 'HK']],
        ]
    }
}
