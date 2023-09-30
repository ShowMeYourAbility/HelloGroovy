package com.llmcu

class L25InnerClass {
    static void main(String[] args) {
        new Outer(name: "liuling").invokeInnerMethod()
    }
}

class Outer {
    String name

    def invokeInnerMethod() {
        new Inner().foo()
    }

    class Inner {
        def foo() {
            println "hello " + name
        }
    }
}