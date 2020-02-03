package com.learning.groovy.classloader

class GroovyScriptEngineBase {

    static void main(String[] args) {
        long start = System.currentTimeMillis()

        Class script = new GroovyScriptEngine("src/main/java/com/learning/groovy/classloader/")
                .loadScriptByName("CycleDemo.groovy")

        Script instance = (Script) script.newInstance();
        instance.invokeMethod("cycle", 5)

        long end = System.currentTimeMillis() - start
        System.out.println(" GroovyScriptEngine时间：" + end)
    }
}
