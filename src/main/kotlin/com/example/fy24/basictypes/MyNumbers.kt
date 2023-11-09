package com.example.fy24.basictypes

class MyNumbers {

    fun integer() {
        val one = 1 // Int
        val threeBillion = 3000000000 // Long
        val oneLong = 1L // Long
        val oneByte: Byte = 1
    }

    fun float() {
        val pi = 3.14 // Double
        // val one: Double = 1 // Error: type mismatch
        val oneDouble = 1.0 // Double

        val e = 2.7182818284 // Double
        val eFloat = 2.7182818284f // Float, actual value is 2.7182817
    }
}

fun main() {
    fun printDouble(d: Double) { print(d) }

    val i = 1
    val d = 1.0
    val f = 1.0f

    printDouble(d)
//    printDouble(i) // Error: Type mismatch
//    printDouble(f) // Error: Type mismatch
}