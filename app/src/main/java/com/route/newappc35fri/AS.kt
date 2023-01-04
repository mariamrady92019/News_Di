package com.route.newappc35fri

import kotlinx.coroutines.*

fun main() {
    runBlocking{
            launch {
                delay(2000)
                try {
                    print("aaaa ${"aaa".subSequence(6 , 45)}")
                } catch (e: Exception) {
                    print("error")
                }
            }
            launch {
                delay(3000)
                print("qqqq")
            }
        }
}