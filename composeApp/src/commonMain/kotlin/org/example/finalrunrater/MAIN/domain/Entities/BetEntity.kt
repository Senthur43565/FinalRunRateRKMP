package org.example.finalrunrater.MAIN.domain.Entities

/**
 **Important Notes**
THIS IS THE 3rd STEP IN DEFINING THE ENTITIES


Imagine you’re playing a cricket betting game in RunRater, and each match is like a big event you’re excited about.
Making a bet is like saying, “I believe this will happen during the game!” Here’s how it works in RunRater:

Bet ID: A unique code that identifies your specific bet, just like a ticket number for tracking.
User: That’s you! The person placing the bet.
Match: The cricket match you’re betting on, like Team A vs. Team B.
Amount: The money or credits you’re betting—for example, ₹100 on your prediction.
Bet Type: The kind of prediction you’re making. Are you guessing the winner (Team A or B)? Predicting the number of runs in an over? Or maybe betting on who’ll hit the next six?
Status: Tracks the progress of your bet—Is it Pending (waiting for the match outcome), Won, or Lost?
Odds: This shows your potential payout. Higher odds mean more risk but also bigger rewards if you win!
Outcome: The result of your bet. Did your prediction come true?
Placed At: The timestamp when you placed the bet, like when you decided to make your prediction.
Settled At: The time when the bet was resolved, and you know if you’ve won or lost.
In RunRater, bets are your way to join the action and make matches even more exciting! 🎯🏏
 * **/

import org.example.finalrunrater.MAIN.domain.Enums.EnumforBetStatus
import org.example.finalrunrater.MAIN.domain.Enums.EnumsforBetTypes

data class BetEntity(
    val id: String,              // Unique identifier for the bet
    val user: UserEntity,              // The user who placed the bet
    val match: MatchEntity,            // The match the bet is placed on
    val amount: Double,          // Amount wagered in this bet
    val betType: EnumsforBetTypes,        // Type of bet (e.g., ball-by-ball, match winner)
    val status: EnumforBetStatus,       // Current status of the bet (e.g., pending, won, lost)
    val odds: Double?,           // The odds for the bet (optional)
    val outcome: String?,        // Outcome of the bet (e.g., "won", "lost", null if not determined yet)
    val placedAt: Long,          // Timestamp for when the bet was placed
    val settledAt: Long?         // Timestamp for when the bet was settled (optional)
)
