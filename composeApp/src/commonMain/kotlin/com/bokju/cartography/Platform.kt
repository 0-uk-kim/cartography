package com.bokju.cartography

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform