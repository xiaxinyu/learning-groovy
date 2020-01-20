package com.learning.groovy.clazz

import com.learning.groovy.clazz.PersonConstructor
import spock.lang.Specification

class PersonConstructorTest extends Specification {

    def "testPersonConstructor"() {
        when:
            def person1 = new PersonConstructor('Marie', 1)
            def person2 = ['Marie', 2] as PersonConstructor
            def PersonConstructor person3 = ['Marie', 3]
        then:
            println(person1)
            println(person2)
            println(person3)
    }
}
