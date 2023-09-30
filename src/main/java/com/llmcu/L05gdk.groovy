package com.llmcu

def process = "java -version".execute()
println process.err.text
println(process.waitFor())