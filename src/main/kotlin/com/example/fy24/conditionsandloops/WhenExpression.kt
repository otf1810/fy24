package com.example.fy24.conditionsandloops

import kotlin.random.Random

class WhenExpression {

    fun myWhen(x: Any) {
        when (x) {
            1 -> print("x == 1")
            2 -> print("x == 2")
            else -> {
                print("x is neither 1 nor 2")
            }
        }
    }

    enum class Bit {
        ZERO, ONE
    }



    fun returnWhen(bit: Bit) {
        val numericValue = when (bit) {
            Bit.ZERO -> 0
            Bit.ONE -> 1
        }

        print(numericValue)
    }

    fun multipleCases(x: Any) {
        when (x) {
            0, 1 -> print("x == 0 or x == 1")
            else -> print("otherwise")
        }
    }

    fun usingIn(x: Any) {
        when (x) {
            in 1..10 -> print("x is in the range")
            !in 10..20 -> print("x is outside the range")
            else -> print("none of the above")
        }
    }

    fun captureVariable() {
        when (val a = Random(5).nextInt()) {
            1 -> print("1")
        }
    }
}

fun main() {
    val whenExpression = WhenExpression()
    whenExpression.myWhen(1)
    whenExpression.returnWhen(WhenExpression.Bit.ONE)
    whenExpression.multipleCases(1)
    whenExpression.usingIn(1)
    whenExpression.captureVariable()
}
