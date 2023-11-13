package com.example.fy24.conditionsandloops

class Loop {

    fun forLoop() {
        for (i in 1..3) {
            println(i)
        }
        for (i in 6 downTo 0 step 2) {
            println(i)
        }
    }

}

fun main() {
    val loop = Loop()
    loop.forLoop()
}
