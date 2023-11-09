package com.example.fy24.basictypes

class MyArrays {

    fun create() {
        // Creates an array with values [1, 2, 3]
        val simpleArray = arrayOf(1, 2, 3)
        println(simpleArray.joinToString())
        // 1, 2, 3

        // Creates an array with values [null, null, null]
        val nullArray: Array<Int?> = arrayOfNulls(3)
        println(nullArray.joinToString())
        // null, null, null

        var exampleArray = emptyArray<String>()

        // Creates an Array<Int> that initializes with zeros [0, 0, 0]
        val initArray = Array<Int>(3) { 0 }
        println(initArray.joinToString())
        // 0, 0, 0

        // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
        val asc = Array(5) { i -> (i * i).toString() }
        asc.forEach { print(it) }
        // 014916
    }

    fun spread(vararg strings: String) {
        for (string in strings) {
            print(string)
        }
    }

    fun compare() {
        val simpleArray = arrayOf(1, 2, 3)
        val anotherArray = arrayOf(1, 2, 3)
        println(simpleArray.contentEquals(anotherArray))

        simpleArray[0] = 10
        println(simpleArray contentEquals anotherArray)
    }
}

fun main() {
    val myArrays = MyArrays()
    myArrays.create()

    println()

    val lettersArray = arrayOf("c", "d")
    myArrays.spread("a", "b", *lettersArray)

    myArrays.compare()
}