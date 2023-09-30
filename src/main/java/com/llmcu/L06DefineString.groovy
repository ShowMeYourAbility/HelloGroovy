package com.llmcu
// 和python一样支持“显式换行符\”
def str = 'hello \
world'
def str2 = "hello world2"
def str3 = '''hello
world3'''
def str4 = """hello
world4"""

def str5 = "${str}5"

def str6 = /Hello
world6/

println str
println str2
println str3
println str4
println str5
println str6

