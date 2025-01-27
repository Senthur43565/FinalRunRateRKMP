package org.example.finalrunrater.MAIN.domain.ModelsDTOs.User

/**
our cricket betting app, where every user is like the MVP player with their own personal kit of stats and records.
Here's how the User model works in this exciting world:

Imagine You’re the Player! 🏏
Your User model is like your personal profile that keeps track of everything about you—your achievements, resources, and activity history.
Here’s what’s in your “player profile”:

UserId:
This is your jersey number—unique to you. It’s how the system knows it’s you and not another player stepping onto the pitch.

Username:
This is your nickname on the scoreboard. It’s the cool name you’re known by in the betting world, like “RunChaser99” or “BetMaster!”

Email:
Think of this as your club membership card. It’s how we send you important updates, notifications, or even exclusive match tips!

Phone Number:
This is your direct hotline—a way to connect instantly, whether it’s for security purposes or quick updates about your winnings or bets.

Balance:
Imagine this is your cricket kit bag filled with coins, representing your available resources. It shows how much you can use to place bets or withdraw as winnings.

Bet History:
This is like your highlight reel—a list of all the bets you’ve placed in previous matches.
You can look back and see how you’ve fared, just like reviewing a great knock or a clever play.

Transaction History:
Think of this as your match records—a detailed log of all the money you’ve deposited, withdrawn, or spent.
It’s your personal tracker to ensure every move is accounted for.

So, in RunRater, the User model is your personal scorecard that keeps everything organized, helping you track your progress, resources,
and history as you dominate the cricket betting arena. You're always ready to play, win, and keep tabs on your stats! 🏆🎉
 * **/

import org.example.finalrunrater.MAIN.domain.Entities.BetEntity
import org.example.finalrunrater.MAIN.domain.Entities.TransactionEntity


data class UserModelDTO(
    val userId: String,
    val username: String,
    val email: String,
    val phoneNumber: String,
    val balance: Double,
    val betHistory: List<BetEntity>, // History of all bets placed by the user
    val transactionHistory: List<TransactionEntity> // List of all transactions (deposits, withdrawals, etc.)
)
