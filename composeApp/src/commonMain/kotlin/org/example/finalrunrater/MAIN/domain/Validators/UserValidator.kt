package org.example.finalrunrater.MAIN.domain.Validators

object UserValidator {
    fun validateUsername(username: String): Boolean {
        return username.length in 3..15 // Username must be between 3 and 15 characters
    }

    fun validateEmail(email: String): Boolean {
        return email.matches(Regex("^[A-Za-z0-9+_.-]+@(.+)\$")) // Basic email pattern
    }

    fun validatePhoneNumber(phone: String): Boolean {
        return phone.matches(Regex("^\\d{10}\$")) // Must be a 10-digit number
    }

    fun validateBalance(balance: Double): Boolean {
        return balance >= 0.0 // Balance must be non-negative
    }
}