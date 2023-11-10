package com.example.fy24.conditionsandloops

class IfExpression {

    fun myIf(a: Int, b: Int) {
        var max = a;
        if (a > b) max = b

        // With else
        if (a > b) {
            max = a
        } else {
            max = b
        }

        max = if (a > b) a else b

        val maxLimit = 1
        val maxOrList = if (maxLimit > a) maxLimit else if (a > b) a else b

        val min = if (a < b) {
            print("Choose a")
            a
        } else {
            print("Choose b")
            b
        }
    }
}

fun main() {
    val ifExpression = IfExpression()
    ifExpression.myIf(1, 10)
}
