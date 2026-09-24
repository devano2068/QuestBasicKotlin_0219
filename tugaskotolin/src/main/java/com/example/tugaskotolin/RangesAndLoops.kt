package com.example.tugaskotolin

fun main() {
    // --- RANGES ---
    println("1..4 (Inklusif):")
    for (number in 1..4) {
        print("$number ") // 1 2 3 4
    }
    println()

    println("1..<4 (Tanpa nilai akhir):")
    for (number in 1..<4) {
        print("$number ") // 1 2 3
    }
    println()

    println("4 downTo 1 (Terbalik):")
    for (number in 4 downTo 1) {
        print("$number ") // 4 3 2 1
    }
    println()

    println("1..5 step 2 (Langkah):")
    for (number in 1..5 step 2) {
        print("$number ") // 1 3 5
    }
    println()

    // --- WHILE LOOP ---
    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake ($cakesEaten)")
        cakesEaten++
    }
}