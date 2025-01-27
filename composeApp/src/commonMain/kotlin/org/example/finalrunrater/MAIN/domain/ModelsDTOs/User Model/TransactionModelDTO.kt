package org.example.finalrunrater.MAIN.domain.ModelsDTOs.User

import org.example.finalrunrater.MAIN.domain.Enums.EnumforTransactionStatus
import org.example.finalrunrater.MAIN.domain.Enums.EnumforTransactionType


data class TransactionModelDTO(
    val transactionId: String,
    val userId: String,
    val amount: Double,
    val transactionType: EnumforTransactionType, // Deposit, Withdrawal, Bet Winning, Bet Loss, etc.
    val status: EnumforTransactionStatus, // PENDING, SUCCESS, FAILED
    val timestamp: Long, // Timestamp of the transaction
    val description: String // Description or details of the transaction (e.g., "Bet placed on match XYZ")
)
