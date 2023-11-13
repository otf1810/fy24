package com.example.fy24.exceptions

class MyException {

    fun tryIsExpression(input: String) {
        // The returned value of a try expression is either the last expression in the try block or the last expression in the catch block (or blocks).
        val a: Int? = try {
            input.toInt()
        } catch (e: NumberFormatException) {
            null
        }
    }

    fun throwIsExpression(person: Person) {
        val s = person.name ?: throw IllegalArgumentException("Name required")
    }

    fun fail(message: String): Nothing {
        // This type has no values and is used to mark code locations that can never be reached
        throw IllegalArgumentException(message)
    }
}

class Person {
    val name: String
        get() {
            return name
        }
}