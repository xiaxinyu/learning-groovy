package com.learning.groovy.string

class StringTest {
    static void main(String[] args) {
        // 单引号字符串
        def a = 'hello "world"'
        println(a)

        // 双引号字符串
        def b = "What's the weather like?"
        println(b)

        // 用加号连接字符串，用等号对比字符串
        assert 'ab' == 'a' + 'b'

        // 三个单引号字符串，支持直接换行
        def aMultilineString = '''
            line one
            line two
            line three
         '''
        println(aMultilineString)


        // 双引号字符串支持用$嵌入变量
        def name = 'Tom'
        def greeting = "hello ${name}"
        println(greeting)
        println(name.getClass())
        println(greeting.getClass())

        // 如需函数调用，则$后表达式要加大括号
        def pi = 3.14
        def piString = "Pi = ${pi.toString()}"
        println(piString)
    }
}
