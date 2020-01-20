package com.learning.groovy.clazz

import spock.lang.Specification

class CoordinatesTest extends Specification {

    def "testCoordinates"() {
        when:
        def coordinates = new Coordinates(latitude: 43.23, longitude: 3.67)
        def (la, lo) = coordinates
        then:
        assert la == 43.23
        assert lo == 3.67
    }
}