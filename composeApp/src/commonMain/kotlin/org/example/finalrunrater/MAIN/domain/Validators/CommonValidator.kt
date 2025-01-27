package org.example.finalrunrater.MAIN.domain.Validators

object CommonValidator {
    fun validateNonEmptyString(value: String, fieldName: String): Boolean {
        if (value.isBlank()) {
            throw IllegalArgumentException("$fieldName cannot be empty")
        }
        return true
    }

    fun validatePositiveNumber(value: Double, fieldName: String): Boolean {
        if (value <= 0) {
            throw IllegalArgumentException("$fieldName must be a positive number")
        }
        return true
    }

    fun validateListNotEmpty(list: List<Any>, fieldName: String): Boolean {
        if (list.isEmpty()) {
            throw IllegalArgumentException("$fieldName cannot be empty")
        }
        return true
    }
}