package com.kev.pubsub

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PubsubApplication

fun main(args: Array<String>) {
    runApplication<PubsubApplication>(*args)
}
