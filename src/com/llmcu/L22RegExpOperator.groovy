package com.llmcu

import java.util.regex.Pattern

/**
 * “~”便捷地创建Pattern
 */
// 双引号的劣势在于要转义反斜杠
//def pattern = ~"^b\\d+\$"
def pattern = ~/^b\d+$/
assert pattern.matcher("b433").matches()
/**
 * “=~”便捷地创建Matcher
 */
def matcher = "b433" =~ /^b\d+$/
assert matcher.matches()
/**
 * “==~”直接返回matches()方法结果
 */
def matches = "b433" ==~ /^b\d+$/
assert matches