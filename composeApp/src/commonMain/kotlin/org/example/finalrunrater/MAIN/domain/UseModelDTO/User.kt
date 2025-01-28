package org.example.finalrunrater.MAIN.domain.UseModelDTO

data class User(
    val userId: String,
    val username: String,
    val email: String,
    val phoneNumber: String,
    val balance: Double,
//    val betHistory: List<Bet>, // History of all bets placed by the user
//    val transactionHistory: List<Transaction> // List of all transactions (deposits, withdrawals, etc.)
)
