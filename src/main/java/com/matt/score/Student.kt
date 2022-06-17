package com.matt.com.matt.score

class Student(var name: String, var math: Int, var english: Int){
    init {

    }

    fun print(){
        println("$name\t$math\t$english\t${getAverage()}")
    }

    fun getAverage() = (math+english)/2
}

fun main() {
    val stu = Student("Matthew", 80, 84)
    stu.print()
    print(stu.getAverage())
}