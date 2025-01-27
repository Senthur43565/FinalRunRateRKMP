package org.example.finalrunrater

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform