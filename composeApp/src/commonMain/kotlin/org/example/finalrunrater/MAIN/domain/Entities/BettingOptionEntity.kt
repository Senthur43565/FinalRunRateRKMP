package org.example.finalrunrater.MAIN.domain.Entities

import org.example.finalrunrater.MAIN.domain.Enums.EnumforMatchStatus
import org.example.finalrunrater.MAIN.domain.Enums.EnumsforBetTypes

/**
 **Important Notes**
THIS IS THE 5th STEP IN DEFINING THE ENTITIES

In the RunRater cricket betting application, a BettingOption adds excitement by letting users pick and predict fun challenges during a match. Here's how it works:

id: A unique identifier for each BettingOption, like a special tag to keep track of it.
matchId: The specific match this BettingOption belongs to (e.g., Team A vs. Team B).
name: The description of the challenge, such as:
“Will the next ball be a six?”
“How many runs will the team score in this over?”
“Who will be the top scorer?”
odds: The likelihood of the challenge happening, represented as a number.
      Higher odds mean the event is less likely but offers a bigger reward, while lower odds indicate a higher chance but smaller payout.
status: The availability of the BettingOption, such as:
   Active: Open for users to place bets.
   Closed: No longer accepting bets (e.g., after the event occurs).
   Settled: The outcome has been determined.
outcome: The result of the challenge (e.g., "Yes" if the next ball was a six, "No" otherwise).
createdAt: The time when the BettingOption was created.
updatedAt: The most recent time the BettingOption was modified (e.g., odds updated or status changed).

In RunRater, a BettingOption keeps the action engaging by letting users predict key moments in the match and win based on their cricket knowledge and intuition! 🏏✨
 * **/

data class BettingOptionEntity(
    val id: String,              // Unique identifier for the betting option
    val match: MatchEntity,            // The match this betting option is associated with
    val description: String,     // A short description of the betting option (e.g., "Next ball will be a six")
    val odds: Double,            // Odds associated with the betting option
    val status: EnumforMatchStatus,          // Status of the betting option (e.g., active, closed)
    val betType: EnumsforBetTypes,         // Type of bet (e.g., ball-by-ball, total runs)
    val outcome: Boolean,         // Outcome of the betting option (e.g., "Yes" if the next ball was a six, "No" otherwise)
    val createdAt: String,       // Date and time when the betting option was created
    val updatedAt: String        // The most recent time the BettingOption was modified (e.g., odds updated or status changed).
)
