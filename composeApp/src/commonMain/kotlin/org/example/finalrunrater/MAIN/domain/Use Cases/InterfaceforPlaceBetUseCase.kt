package org.example.finalrunrater.MAIN.domain.Use

/**
 **Important Notes**
THIS IS THE 1st STEP IN DEFINING THE "USE CASES"
 **/

import org.example.finalrunrater.MAIN.domain.Entities.BetEntity


interface InterfaceforPlaceBetUseCase {
    suspend fun execute(userId: String, matchId: String, bet: BetEntity): Result<BetEntity>
}