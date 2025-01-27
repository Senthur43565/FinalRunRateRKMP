package org.example.finalrunrater.MAIN.domain.Use

import org.example.finalrunrater.MAIN.domain.Entities.BettingOptionEntity


interface InterfaceforGetBettingOptionsUseCase {
    suspend fun execute(matchId: String): Result<List<BettingOptionEntity>>
}