package org.example.finalrunrater.MAIN.domain.Validators

data class ValidationResult(
    val isValid: Boolean,
    val errorMessage: String? = null
)
