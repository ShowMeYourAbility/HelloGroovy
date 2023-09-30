package com.llmcu

def num = (byte) 2
assert num instanceof Byte
def num2 = (short) 2
assert num2 instanceof Short
def num3 = 2
assert num3 instanceof Integer
def num4 = (Long) 2
assert num4 instanceof Long
def num5 = (char) 2
assert num5 instanceof Character
// BigInteger范围比Long还在大
def num6 = (BigInteger) 2
assert num6 instanceof BigInteger
// 二进制以0b开头
def num7 = 0b0100_0000
assert num7 == 64
// 八进制以0开头
def num8 = 0100
assert num8 == 64
// 十六进制以0x开头
def num9 = 0x40
assert num9 == 64




