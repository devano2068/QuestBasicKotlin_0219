package com.example.tugaskotolin

fun main() {
    // --- IF-ELSE EXPRESSION ---
    val check = true
    val d: Int
    if (check) {
        d = 1
    } else {
        d = 2
    }
    println("Hasil IF: $d")

    // --- WHEN STATEMENT & EXPRESSION ---
    val obj = "Hello"

    // When sebagai Statement
    when (obj) {
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else -> println("Unknown")
    }

    // When sebagai Expression (menghasilkan nilai)
    val result = when (obj) {
        "1" -> "One"
        "Hello" -> "Greeting"
        else -> "Unknown"
    }
    println("Hasil WHEN Expression: $result")
}