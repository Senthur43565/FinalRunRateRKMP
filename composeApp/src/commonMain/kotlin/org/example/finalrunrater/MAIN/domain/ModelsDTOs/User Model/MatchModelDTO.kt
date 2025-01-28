package org.example.finalrunrater.MAIN.domain.ModelsDTOs.User

import org.example.finalrunrater.MAIN.domain.Entities.BettingOptionEntity
import org.example.finalrunrater.MAIN.domain.Enums.EnumforMatchStatus


data class MatchModelDTO(
    val matchId: String,
    val team1: String,
    val team2: String,
    val matchStatus: EnumforMatchStatus, // Ongoing, Completed, Upcoming
    val matchDate: Long, // The date and time when the match is scheduled to happen
    val bettingOptions: List<BettingOptionEntity> // List of available betting options for this match
)

