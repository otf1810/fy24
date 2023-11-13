package com.example.fy24.classesandobjects

class Classes {

}

//class Person {}

class Empty

//class Person constructor(firstName: String)

//class Person(firstName: String)

class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

// default value
//class Person(val firstName: String, val lastName: String, var isEmployed: Boolean = true)

class Person(val name: String) {
    val children: MutableList<Person> = mutableListOf()
    // secondary constructor
    constructor(name: String, parent: Person) : this(name) {
        parent.children.add(this)
    }
}

open class Polygon {
    open fun draw() {
        // some default polygon drawing method
    }
}

abstract class WildShape : Polygon() {
    // Classes that inherit WildShape need to provide their own
    // draw method instead of using the default on Polygon
    abstract override fun draw()
}

