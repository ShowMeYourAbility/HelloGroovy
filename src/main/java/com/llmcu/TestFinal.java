package com.llmcu;

public class TestFinal {
    /**
     * 如果所有构造方法都会给name属性赋值的话，此写法是没有问题的
     */
    private final String name;

    public TestFinal(String name) {
        this.name = name;
    }
}
