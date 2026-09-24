package com.example.tugaskotolin

fun main() {
    // Hello World
    println("Hello, world!")

    // Variables (val = read-only, var = mutable)
    val customers = 10
    var orders = 5
    orders = 6

    // String Templates ($)
    println("There are $customers customers")
    println("Total orders: $orders")

    // Explicit Type Declaration
    val d: Int
    d = 3
    val e: String = "hello"
    println("d = $d, e = $e")
}