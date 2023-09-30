package com.llmcu

//def pickEven(int n, Closure customClosure) {
// 1、定义方法时居然可以省略参数类型
def pickEven(n, customClosure) {
    for (int i = 2; i <= n; i += 2) {
        customClosure(i)
    }
}
// 2、花括号包裹的lambda表达式就是闭包
pickEven(2, { it -> println it })
// 3、花括号可省略：lambda表达式就是闭包
pickEven(4, it -> println it)
def sum = 0
// 4、闭包就是复用了偶数循环部分
pickEven(6, it -> sum += it)
assert sum == 12


