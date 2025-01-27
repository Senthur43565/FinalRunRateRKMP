package org.example.finalrunrater.MAIN.domain.Use

import org.example.finalrunrater.MAIN.domain.Entities.MatchEntity


interface InterfaceforGetMatchDetailsUseCase {
    suspend fun execute(matchId: String): Result<MatchEntity>
}