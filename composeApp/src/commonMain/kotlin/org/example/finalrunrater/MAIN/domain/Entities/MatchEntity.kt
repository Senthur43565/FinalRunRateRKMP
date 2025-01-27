package org.example.finalrunrater.MAIN.domain.Entities

import org.example.finalrunrater.MAIN.domain.Enums.EnumforMatchStatus

/**
Important Notes:
THIS IS THE 2nd STEP IN DEFINING THE ENTITIES

Okay, imagine you’re at a big playground where two teams are getting ready to play a game of cricket.
The Match entity is like a special box that keeps track of everything about that game!

Match ID: This is like a name tag for the game, so everyone knows which game we’re talking about.

Teams: These are the kids playing! It’s like saying, “Team A vs. Team B.” You can cheer for your favorite team!

Match Start Time: This tells us when the game is going to start. It’s like waiting for the bell to ring before recess!

Match Status: This is like a scoreboard that tells us if the game is still happening, if it’s over, or if they’re taking a break.

Betting Options: This is like guessing who will win the game. Maybe you think Team A will score the most runs, and you can tell your friends what you think!

Winner: After the game is over, we find out who won! If the game is still happening, we don’t know yet, so it can be empty.

Created At & Updated At: These are like little notes that tell us when we first started talking about this game and when we last checked to see how the game is going.

So, the Match entity is like a fun little scoreboard that helps everyone keep track of the game and who they think will win!
 **/


data class MatchEntity(
    val id: String,                  // Unique identifier for the match
    val teams: List<String>,          // Teams playing in the match
    val matchStartTime: Long,         // Start time of the match (timestamp)
    val matchStatus: EnumforMatchStatus,    // Current status of the match (e.g., ongoing, completed)
    val bettingOptions: List<BettingOptionEntity>, // Different betting options available for this match
    val winner: String?,              // The winner of the match (can be null if the match is ongoing)
    val createdAt: Long,              // Timestamp for when the match was added to the app
    val updatedAt: Long               // Timestamp for when the match data was last updated
)
