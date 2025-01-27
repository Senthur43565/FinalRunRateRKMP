package org.example.finalrunrater.MAIN.domain.Interfaces

/**
 **Important Notes**
THIS IS THE 1st STEP IN DEFINING THE INTERFACES

In the RunRater cricket betting application, imagine your UserRepository is like your trusty helper for all things related to your bets and account. Here's how this magical helper works:

Get Your Bet Details:
Just like you'd want to grab a toy from your box, you can ask the UserRepository to fetch your user details or betting history.
It knows how to find your account information and all the bets you've placed!

Change Your Bet Details:
If you decide to change something about your bet, like updating the amount or choosing a different bet type, the UserRepository can help you make those changes.
It keeps your bet info fresh!

Look at Your Betting History:
Ever wonder what bets you made in the past? The UserRepository can show you all the bets you've placed before, like looking at your play history.
This way, you can track your wins, losses, and everything in between!

Add More Bets:
Got a new bet to place? The UserRepository can help you add that bet, updating your balance in the process.
Think of it as adding a new toy to your box!

Check Your Transactions:
Want to know what’s happened with your money? The UserRepository can show you your transaction history—like
when you deposited or withdrew money or placed a bet—so you can stay on top of all your actions!

So, in RunRater, the UserRepository is your personal assistant that keeps everything organized, from your account to your bets and transactions! 🏏✨
 * **/

import org.example.finalrunrater.MAIN.domain.Entities.BetEntity
import org.example.finalrunrater.MAIN.domain.Entities.TransactionEntity
import org.example.finalrunrater.MAIN.domain.Entities.UserEntity

interface UserRepositoryInterface {
    suspend fun getUser(userId: String): Result<UserEntity>
    suspend fun updateUser(user: UserEntity): Result<Boolean>
    suspend fun getBetHistory(userId: String): Result<List<BetEntity>>
    suspend fun updateUserBalance(userId: String, amount: Double): Result<Boolean>
    suspend fun getTransactionHistory(userId: String): Result<List<TransactionEntity>>
}