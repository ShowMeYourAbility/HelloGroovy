package com.llmcu

// [k:value,k2:value2]为map的表示方法；字符串类型的key，可以连引号都省略
def colorMap = [red:"#FF0000",green:"#00FF00",blue:"#0000FF"]
// map的key值类型会自行推导为非String类型
def colorMap2 = [1:"#FF0000",2:"#00FF00",3:"#0000FF"]
colorMap2.keySet().every{it.class==Integer}

// 默认为LinkedHashMap
assert colorMap instanceof LinkedHashMap
// 同理，可以通过as和预先声明指定为其他类型的map
def colorMap3 = [red: "#FF0000", green: "#00FF00", blue: "#0000FF"] as TreeMap
assert colorMap3 instanceof TreeMap

// 两种特有取值方式
assert colorMap["red"] == "#FF0000"
assert colorMap.red == "#FF0000"
// 两种特有的设、添值方式
colorMap["yellow"] = "#FFFF00"
colorMap.red = "#FF0001"
assert colorMap.yellow == "#FFFF00"
assert colorMap["red"] == "#FF0001"

def pinkKey = "pink"
// 方法中的变量：直接写
colorMap[pinkKey] = "#FF00FF"
assert colorMap.containsKey("pink")
// 数据中的变量：加括号
colorMap = [(pinkKey):"#FF00FF"]
assert colorMap.containsKey("pink")
