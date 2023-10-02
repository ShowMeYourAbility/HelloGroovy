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
// miL是"指定底的幂运算器生成器"接口实例；l1是“已指定底的幂运算器”；l1(2)是“幂运算器执行幂运算”
def l1 = miL(3)
assert l1(2) == 9
