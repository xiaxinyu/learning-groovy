package com.learning.groovy.range

class RangeBase {
    static void main(String[] args) {
        def text = 'nice cheese gromit!'

        def x = text[2]
        assert x == 'c'
        assert x.class == String

        def sub = text[5..10]
        assert sub == 'cheese'

        def list = [10, 11, 12, 13]
        def answer = list[2, 3]
        assert answer == [12, 13]

        list = 100..200
        sub = list[1, 3, 20..25, 33]
        assert sub == [101, 103, 120, 121, 122, 123, 124, 125, 133]
    }
}
