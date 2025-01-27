package org.example.finalrunrater.MAIN.domain.Enums

/**
 * Transaction Statuses:
 * Success: The transaction was completed without issues.
 * Failed: The transaction couldn't be processed (e.g., insufficient balance).
 * **/

enum class EnumforTransactionStatus {
    SUCCESS,
    FAILED,
    PENDING
}