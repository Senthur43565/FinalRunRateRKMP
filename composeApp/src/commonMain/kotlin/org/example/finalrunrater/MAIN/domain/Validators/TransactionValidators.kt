package org.example.finalrunrater.MAIN.domain.Validators

import org.example.finalrunrater.MAIN.domain.Enums.EnumforTransactionStatus
import org.example.finalrunrater.MAIN.domain.Enums.EnumforTransactionType

object TransactionValidators {
    fun validateTransactionAmount(amount: Double): Boolean {
        return amount > 0 // Transaction amount must be positive
    }

    fun validateTransactionType(type: EnumforTransactionType): Boolean {
        return type in EnumforTransactionType.entries.toTypedArray() // Must be a valid transaction type
    }

    fun validateTransactionStatus(status: EnumforTransactionStatus): Boolean {
        return status in EnumforTransactionStatus.entries.toTypedArray() // Must be a valid transaction status
    }

    fun validateDescription(description: String): Boolean {
        return description.length in 1..255 // Description length must be between 1 and 255 characters
    }
}