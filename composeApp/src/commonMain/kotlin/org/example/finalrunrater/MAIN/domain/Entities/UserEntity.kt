package org.example.finalrunrater.MAIN.domain.Entities

/**
Important Notes:
 This is the first step in defining the Entity Package inside the domain package..
* UserEntity is a data class that represents a user in the application.
* It contains various properties, including the user's unique identifier, name, email, phone number,
 * **/


data class UserEntity (
    val id: String,          // Unique identifier for the user
    val name: String,        // User's name
    val email: String,       // User's email (optional, for account management)
    val phoneNumber: String, // User's phone number
    val balance: Double,     // User's available balance for placing bets
    val betHistory: List<BetEntity>, // List of bets the user has placed in the past
    val transactionHistory: List<TransactionEntity>, // List of financial transactions
    val createdAt: Long,     // Account creation timestamp
    val updatedAt: Long      // Last profile update timestamp
)