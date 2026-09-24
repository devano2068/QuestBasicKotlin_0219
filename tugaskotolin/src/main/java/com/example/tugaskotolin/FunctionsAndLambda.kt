package com.example.tugaskotolin

// Fungsi dengan kembalian Int
fun sum(x: Int, y: Int): Int {
    return x + y
}

// Fungsi dengan Default Parameter Value
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

// Fungsi tanpa return value (Unit)
fun printMessage(message: String) {
    println(message)
}

fun main() {
    // Memanggil Fungsi biasa
    println("Hasil Sum: ${sum(1, 2)}")

    // Named Arguments & Default Values
    printMessageWithPrefix("Hello", "Log") // [Log] Hello
    printMessageWithPrefix("Hello")        // [Info] Hello (menggunakan default prefix)
    printMessageWithPrefix(prefix = "Log", message = "Hello") // Named arguments

    printMessage("Hello")

    // Lambda Expression
    val uppercaseLambda = { string: String -> string.uppercase() }
    println("Lambda Output: ${uppercaseLambda("hello")}")
}