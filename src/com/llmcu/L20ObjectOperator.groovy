package com.llmcu
/**
 * 安全导航运算符
 */
class Person {
    String name
}

Person person = null
// 如果对象不存在，返回null
def name = person?.name
def name2 = person?.getName()
assert name == null
assert name2 == null
/**
 * 直接字段访问运算符
 */
class User {
    private String name

    String getName() {
        return "name:$name"
    }
}

def user = new User(name: "Bob")
// 本质是get方法
assert user.name == "name:Bob"
// .@ 运算符提供了一种绕过访问修饰符的机制，可以直接访问对象的字段，无论其访问级别如何
assert user.@name == "Bob"
/**
 * 方法引用运算符
 */
def reduce = [1, 2, 3].stream().reduce(0, Integer::sum)
assert reduce == 6