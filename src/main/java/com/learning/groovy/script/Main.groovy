package com.learning.groovy.script

import org.codehaus.groovy.runtime.InvokerHelper

class Main {
    static void main(String[] args) {
        GroovyScriptEngine engine = new GroovyScriptEngine("src/main/java/com/learning/groovy/script/");

        Binding binding1 = new Binding();
        Object result1 = engine.run("FunGroove.groovy", binding1);
        System.out.println(result1);

        System.out.println("===================================");

        Binding binding2 = new Binding();
        binding2.setVariable("arg", "测试参数");

        Object result2 = engine.run("FunArgGroove.groovy", binding2);
        System.out.println(result2);
    }
}