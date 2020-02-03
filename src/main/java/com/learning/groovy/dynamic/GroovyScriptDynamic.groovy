package com.learning.groovy.dynamic

import org.codehaus.groovy.runtime.InvokerHelper

class DynamicExample1 {

    public static void main(String[] args) {
        GroovyClassLoader classLoader = new GroovyClassLoader()
        Class<?> ruleClazz = classLoader.parseClass(
                "def b(){ println \"I am grovy script b\" }\n" +
                        "void c(){println \"I am grovy script c\"}\n" +
                        "private d(){println \"I am grovy script d\"}\n" +
                        "def e(int param = 1000){println \"I am grovy script e param default value is \"+param}\n" +
                        "String f(){return \"return from method\"}"
        )
        Script script = InvokerHelper.createScript(ruleClazz, new Binding())
        script.invokeMethod("b", null)
        script.invokeMethod("c", null)
        script.invokeMethod("d", null)
        script.invokeMethod("e", null)
        println script.invokeMethod("f", null)
    }

}
