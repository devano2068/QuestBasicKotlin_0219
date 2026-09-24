package com.example.tugaskotolin

fun main() {
    // --- LIST ---
    // Read-only List
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println("List Read-only: $readOnlyShapes")
    println("Item pertama: ${readOnlyShapes.first()}, Total: ${readOnlyShapes.count()}")

    // Mutable List
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    shapes.add("pentagon")
    shapes.remove("square")
    println("Mutable List: $shapes")

    // --- SET ---
    // Read-only Set (Unik & Tidak berurutan)
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    println("Set Read-only (tanpa duplikat): $readOnlyFruit")

    // Mutable Set
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry")
    fruit.add("dragonfruit")
    println("Mutable Set: $fruit")

    // --- MAP ---
    // Read-only Map (Key-Value)
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println("Harga Apple Juice: ${readOnlyJuiceMenu["apple"]}")

    // Mutable Map
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    juiceMenu.put("mango", 150)
    juiceMenu.remove("orange")
    println("Mutable Map: $juiceMenu")
}