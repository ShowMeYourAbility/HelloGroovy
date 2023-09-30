package com.llmcu

String name = null
// 正常的条件运算符表达式
def display = name ? name : 'Anonymous'
// 与上等效的elvis运算符表达式（字符串非空为true，为true时返回自身的省略表示法）
display = name ?: 'Anonymous'
assert display == 'Anonymous'