package com.example.fy24.returnsandjumps

class ReturnsAndJumps {

    fun breakToLabel() {
        loop@ for (i in 1..100) {
            for (j in 1..100) {
                if (i * j == 10) break@loop
            }
        }
    }

    fun returnToLabel() {
        fun foo() {
            listOf(1, 2, 3, 4, 5).forEach {
                if (it == 3) return@forEach // local return to the caller of the lambda - the forEach loop
                print(it)
            }
            print(" done with implicit label")
        }
    }
}
