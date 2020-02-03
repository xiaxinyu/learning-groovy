package com.learning.groovy.classloader

class GroovyClassLoaderBase {

    static void main(String[] args) {
        long start = System.currentTimeMillis()
        GroovyClassLoader classLoader = new GroovyClassLoader()
        Class aClass = classLoader.parseClass(new File("src/main/java/com/learning/groovy/classloader/CycleDemo.groovy"))
        GroovyObject instance = (GroovyObject) aClass.newInstance();
        instance.invokeMethod("cycle", 5)
        long end = System.currentTimeMillis() - start
        System.out.println(" GroovyClassLoader时间：" + end)
    }
}
