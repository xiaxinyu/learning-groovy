package com.learning.groovy.clazz

import spock.lang.Specification

class JavaObjectTest extends Specification {

    def "testPlus"() {
        when:
        def obj = new JavaObject()
        def plusV = JavaObject.plus(1,2);
        then:
        assert plusV == 3
    }
}