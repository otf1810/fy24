package com.example.fy24.basictypes

class MyStrings {

    fun loop(str: String) {
        for (s in str) {
            println("$s,")
        }
    }

    fun multilineString() {
        val multilineString = """
            for (c in "foo")
                print(c)
        """.trimIndent()
        val text = """
            |Tell me and I forget.
            |Teach me and I remember.
            |Involve me and I learn.
            |(Benjamin Franklin)
        """.trimMargin()
        println(multilineString)
        println(text)
    }

    fun template(name: String) {
        println("hello, my name is $name")
    }
}

fun main() {
    val myStrings = MyStrings()
    myStrings.loop("helloworld")
    myStrings.multilineString()
    myStrings.template("fenton")
}