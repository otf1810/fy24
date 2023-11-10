package com.example.fy24.basictypes

class TypeChecksAndCasts {

    fun isOperators(obj: Any) {
        if (obj is String) {
            print(obj.length)
        }

        if (obj !is String) {
            print("Not a String")
        } else {
            print(obj.length)
        }
    }

    fun smartCasts(x: Any) {
        if (x is String) {
            print(x.length) // x is automatically cast to String
        }

        if (x !is String) return

        print(x.length) // x is automatically cast to String
    }

    fun unsafeCastOperator(y: Any?) {
        // if y is null, the code above throws an exception
        val x: String = y as String
        // use nullable type
        val z: String? = y as String?
    }

    fun safeCaseOperator(y: Any?) {
        // To avoid exceptions, use the safe cast operator as?, which returns null on failure.
        val x: String? = y as? String
        print(x)
    }
}

fun main() {
    val typeChecksAndCasts = TypeChecksAndCasts()
    typeChecksAndCasts.isOperators("fenton")
    typeChecksAndCasts.unsafeCastOperator(null)
    typeChecksAndCasts.safeCaseOperator(null)
}
