package com.ipsoft.kmmskeleton

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform