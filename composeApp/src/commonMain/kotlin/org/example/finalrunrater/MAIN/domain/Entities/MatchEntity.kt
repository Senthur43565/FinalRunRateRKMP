package org.example.finalrunrater.MAIN.domain.Entities

/**
Important Notes:
 This is the first step in defining the Entity Package inside the domain package..
* MatchEntity is a data class that represents a match in the application.
* It contains various properties, including the match's unique identifier, teams, start time,
 * status, betting options, winner, and timestamps for creation and last update.
 **/


data class MatchEntity(
    val id: String,                  // Unique identifier for the match
    val teams: List<String>,          // Teams playing in the match
    val matchStartTime: Long,         // Start time of the match (timestamp)
    val matchStatus: MatchStatus,    // Current status of the match (e.g., ongoing, completed)
    val bettingOptions: List<BettingOptionEntity>, // Different betting options available for this match
    val winner: String?,              // The winner of the match (can be null if the match is ongoing)
    val createdAt: Long,              // Timestamp for when the match was added to the app
    val updatedAt: Long               // Timestamp for when the match data was last updated
)
