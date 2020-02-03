package com.learning.groovy.shell

class ShellTest {
    static void main(String[] args) {
        def process = "ls -l".execute()
        process.in.eachLine { line ->
            println(line)
        }
    }
}
