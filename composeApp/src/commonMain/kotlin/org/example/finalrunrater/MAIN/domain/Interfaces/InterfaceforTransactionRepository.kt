package org.example.finalrunrater.MAIN.domain.Interfaces

/**
 **Important Notes**
THIS IS THE 4th STEP IN DEFINING THE INTERFACES

Alright, buddy! Now, let’s imagine the TransactionRepository is like your super smart toy box that helps you keep track of all the fun things you do with your toys,
except instead of toys, we’re talking about your bets and money transactions in RunRater!

Get Transactions:
This is like asking your helper to show you all the toys you’ve played with recently.
In the TransactionRepository, you can ask it to show all the bets and transactions you've made—like deposits, withdrawals, and bet placements.
It’s like looking back at all the actions you've taken in the game.

Create Transaction:
Whenever you make a new bet or deposit money to play, it’s like adding a new toy to the box!
The TransactionRepository helps record each action, like when you put money in to place a bet or withdraw winnings after a successful guess.

Update Transaction Status:
Sometimes, you’re not quite sure when you’ll play with your toys next, so you update their status to remind yourself!
The TransactionRepository can help you change the status of your bets or transactions. Maybe you placed a bet,
but you’re still waiting to see if it’s going to win, or maybe you withdrew your winnings. The TransactionRepository keeps track of the current state so you know exactly where you are in the process.

So, in RunRater, the TransactionRepository is like your best buddy, keeping track of everything you’ve done with your bets,
helping you stay organized and ensuring you never forget which transactions have been completed or are still waiting! Pretty awesome, right? 🏏💰
  **/

import org.example.finalrunrater.MAIN.domain.Entities.TransactionEntity
import org.example.finalrunrater.MAIN.domain.Enums.EnumforTransactionStatus

interface InterfaceforTransactionRepository {
    suspend fun getTransactions(userId: String): Result<List<TransactionEntity>>
    suspend fun createTransaction(transaction: TransactionEntity): Result<TransactionEntity>
    suspend fun updateTransactionStatus(transactionId: String, status: EnumforTransactionStatus): Result<Boolean>
}