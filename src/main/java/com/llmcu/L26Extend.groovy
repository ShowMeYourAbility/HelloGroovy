package com.llmcu

class L26Extend {
    static void main(String[] args) {
        def student = new Student(name: "liuling", id: 9);
        println student.name
    }
}

class Person2 {
    String name
}

class Student extends Person2 {
    Integer id
}