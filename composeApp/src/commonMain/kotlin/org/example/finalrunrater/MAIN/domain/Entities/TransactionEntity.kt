package org.example.finalrunrater.MAIN.domain.Entities

/**
 **Important Notes**
THIS IS THE 4th STEP IN DEFINING THE ENTITIES

In the RunRater cricket betting application, we keep track of every action related to a user's wallet with something called a Transaction.
Each transaction ensures transparency and helps users track their betting activities. Here's how it works:

id: A unique identifier for the transaction, like a receipt number to distinguish each action.
user: The account of the user involved in the transaction (e.g., User's wallet).
amount: The value of the transaction. Positive numbers indicate credits added (like winnings or deposits), and negative numbers indicate debits (like placing a bet or withdrawals).
transactionType: The type of transaction. For example:
Deposit: Adding money to the wallet.
Withdrawal: Taking money out of the wallet.
Bet Deduction: Money deducted when placing a bet.
Bet Winnings: Money credited after a successful bet.
status: The outcome of the transaction:
Success: The transaction was completed without issues.
Failed: The transaction couldn’t be processed (e.g., insufficient balance).
Pending: Waiting for confirmation (e.g., deposit via payment gateway).
timestamp: The exact time the transaction occurred, helping users track when actions were taken.
details: Any additional information about the transaction. For instance, if a deposit failed, it could include the reason (e.g., payment gateway timeout).
The Transaction system in RunRater ensures every coin in the user's wallet is accounted for, offering transparency and trust in the betting process! 🏏💰
 * **/

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
