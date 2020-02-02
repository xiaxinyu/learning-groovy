package com.learning.groovy.map

class MapFilter {
    static void main(String[] args) {
        def people = [
                1: [name: 'Bob', age: 32, gender: 'M'],
                2: [name: 'Johnny', age: 36, gender: 'M'],
                3: [name: 'Claire', age: 21, gender: 'F'],
                4: [name: 'Amy', age: 54, gender: 'F']
        ]


        def bob = people.find { it.value.name == 'Bob' } // 查找单个entry
        def females = people.findAll { it.value.gender == 'F' }

        println(bob)
        println(females)

        def agesOfMales = people.findAll { key, value -> value.gender == 'M' }
                .collect { key, value -> value.age }
        assert agesOfMales == [32, 36]

        assert people.every { key, value -> value.age > 18 }

        assert people.any { key, value -> value.age == 54 }
    }
}
