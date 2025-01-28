package org.example.finalrunrater.MAIN.domain.Validators

import org.example.finalrunrater.MAIN.domain.Enums.EnumforMatchStatus

object MatchValidator {
    fun validateMatchId(matchId: String): Boolean {
        return matchId.isNotBlank() // Match ID cannot be blank
    }

    fun validateTeams(team1: String, team2: String): Boolean {
        return team1.isNotBlank() && team2.isNotBlank() && team1 != team2 // Teams must be valid and different
    }

//    fun validateMatchDate(matchDate: Long): Boolean {
//        return matchDate > System.currentTimeMillis() // Match date must be in the future
//    }

    fun validateMatchStatus(status: EnumforMatchStatus): Boolean {
        return status in listOf(EnumforMatchStatus.UPCOMING, EnumforMatchStatus.ONGOING, EnumforMatchStatus.COMPLETED, EnumforMatchStatus.CANCELLED)
    }
}