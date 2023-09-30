package com.llmcu

// 默认是ArrayList
//def list = [1, 2, 3]
//assert list.class == ArrayList
// 集合内元素可以类型不同(相当于元素都是Object类型呗)
//def list2 = [1, "a", true]
//assert list2.class == ArrayList
// 通过as改变数据类型
def intArray = [1,2,3] as int[]
assert intArray.class == int[]
// Java方式预先指定类型
String[] stringArray = ["a","b","c"]
assert stringArray.class == String[]
// 类似python的获取元素方式，-2代表倒数第2个
assert intArray[0] == 1
assert intArray[-2] == 2
// 数组无法使用左移运算符，在末尾增加元素
//intArray << 4
// 多维集合
int[][] list3 = [[3, 4, 5], [9, 8,7,6]]
assert list3[1][0] == 9
def list4 = [[3, 4, 5], [9, 8]] as int[][]
assert list4[1][0] == 9

String[] books = ["groovy in action","java in action"]
// gdk的sum()方法
assert books.sum()=="groovy in actionjava in action"
// gdk的every()、any()方法（cmd+左键查看方法定义，其第一个参数self是不用传递的）
assert books.every(it->it.contains("action"))
assert books.any(it->it.contains("java"))
// 闭包写法：括号改花括号(lambda表达式作为最后一个参数时，可将它放到方法外面，这就是闭包写法)
assert books.any{it->it.contains("java")}
// 闭包简略写法：省略参数声明和箭头函数
assert books.any{it.contains("java")}