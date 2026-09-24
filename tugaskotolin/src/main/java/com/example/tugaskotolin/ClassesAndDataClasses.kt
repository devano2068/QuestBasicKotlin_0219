package com.example.tugaskotolin

// Standard Class
class Contact(val id: Int, var email: String) {
    fun printId() {
        println("ID Contact: $id")
    }
}

// Data Class
data class User(val name: String, val id: Int)

fun main() {
    // --- STANDARD CLASS ---
    val contact = Contact(1, "mary@gmail.com")
    println("Email Awal: ${contact.email}")
    contact.email = "jane@gmail.com" // Update properti var
    println("Email Baru: ${contact.email}")
    contact.printId()

    println("-------------------")

    // --- DATA CLASS ---
    val user = User("Alex", 1)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    // Automatic toString()
    println("Print Data Class: $user") // User(name=Alex, id=1)

    // Compare instances (==)
    println("user == secondUser: ${user == secondUser}") // true
    println("user == thirdUser: ${user == thirdUser}")   // false

    // Copy instance & Ubah Properti
    val updatedUser = user.copy(name = "Max")
    println("Copied User: $updatedUser") // User(name=Max, id=1)
}