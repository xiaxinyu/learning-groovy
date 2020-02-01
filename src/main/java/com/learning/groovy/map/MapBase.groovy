package com.learning.groovy.map

class MapBase {
    static void main(String[] args) {
        def map = [name: 'Gromit', likes: 'cheese', id: 1234]
        println(map.getClass())

        assert map.class == null

        // 'entry' is a map entry
        map.each { entry -> println "Name: $entry.key  Value: $entry.value" }
        map.eachWithIndex { en, i -> println "$i - Name: $en.key  Value: $en.value" }
    }
}
