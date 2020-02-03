package com.learning.groovy.classloader

class GroovyShellBase {

    static void main(String[] args) {
        long start = System.currentTimeMillis()

        new GroovyShell().parse(new File("src/main/java/com/learning/groovy/classloader/CycleDemo.groovy")).invokeMethod("cycle", 5)

        long end = System.currentTimeMillis() - start
        System.out.println(" GroovyShell时间：" + end)
    }
}
