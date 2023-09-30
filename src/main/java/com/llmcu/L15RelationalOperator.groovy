package com.llmcu

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Cat {
    String name
}
// 根据报错信息发现：要求有无参构造法
def cat = new Cat(name: "mimi")
// 要求有相应构造方法
//def cat2 = new Cat("mimi")
def copycat = cat
def cat3 = new Cat(name: "mimi")

// 大于、大于等于、小于、小于等于
assert 5 >= 3
// 等于、不等于
assert 5 == 5
assert 5 != 3
// ==与equals大多数情况下等效，但==更灵活，可以进行类型转换、处理空引用等
assert cat == cat3
assert cat.equals(cat3)
// ===：同一个对象
assert cat === copycat
assert 5 === 5
// !==：不是同一个对象
assert cat !== cat3
