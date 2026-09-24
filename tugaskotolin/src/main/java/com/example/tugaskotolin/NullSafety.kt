package com.example.tugaskotolin

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

// Safe Call pada Return Function
fun lengthString(maybeString: String?): Int? = maybeString?.length

fun main() {
    // Nullable Type (?)
    var nullable: String? = "You can keep a null here"
    nullable = null // Diperbolehkan

    // Checking for Null
    val nullString: String? = null
    println(describeString(nullString))

    // Safe Call Operator (?.)
    println("Safe Call Result: ${lengthString(nullString)}") // null

    // Elvis Operator (?:) - Memberikan nilai default jika null
    val length = nullString?.length ?: 0
    println("Length dengan Elvis Operator: $length") // 0
}