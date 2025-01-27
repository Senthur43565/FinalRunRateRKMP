package org.example.finalrunrater.MAIN.domain.Use


/**
 **Important Notes**
THIS IS THE 2nd STEP IN DEFINING THE "USE CASES"
 **/

import org.example.finalrunrater.MAIN.domain.Entities.UserEntity


interface InterfaceforGetUserDetailsUseCase {
    suspend fun execute(userId: String): Result<UserEntity>
}