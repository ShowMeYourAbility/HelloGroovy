package com.llmcu

def sum = (a, b) -> a + b
assert sum(3, 4) == 7

//def miL = l->{h->l**h}
// 便于理解的写法
def miL = { l ->
    return { h ->
        return l**h
    }
}
// miL是闭包定义；l1是闭包实例；l1(2)是闭包实例的使用
def l1 = miL(3)
assert l1(2) == 9
