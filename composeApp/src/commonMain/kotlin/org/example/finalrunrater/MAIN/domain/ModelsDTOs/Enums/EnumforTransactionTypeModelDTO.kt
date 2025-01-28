package org.example.finalrunrater.MAIN.domain.ModelsDTOs.Enums

enum class EnumforTransactionTypeModelDTO {
    DEPOSIT,         // When the user adds money to their account
    WITHDRAWAL,      // When the user withdraws money from their account
    BET_WINNING,     // When the user wins a bet and receives their payout
    BET_LOSS,        // When the user loses a bet and the amount is deducted
}