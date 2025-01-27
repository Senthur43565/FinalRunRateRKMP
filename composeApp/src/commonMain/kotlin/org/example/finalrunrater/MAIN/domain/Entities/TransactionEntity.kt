package org.example.finalrunrater.MAIN.domain.Entities

import org.example.finalrunrater.MAIN.domain.Enums.EnumforTransactionStatus
import org.example.finalrunrater.MAIN.domain.Enums.EnumforTransactionType

data class TransactionEntity(
    val id: String,              // Unique identifier for the transaction
    val user: UserEntity,              // The user who made the transaction
    val amount: Double,          // Amount added or deducted
    val transactionType: EnumforTransactionType, // Type of the transaction (e.g., deposit, withdrawal, bet placement)
    val status: EnumforTransactionStatus, // Status of the transaction (e.g., success, failed)
    val timestamp: Long,         // Timestamp for when the transaction occurred
    val details: String?         // Additional details about the transaction (optional)
)
