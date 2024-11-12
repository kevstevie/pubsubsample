package com.kev.pubsub.pubsub

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.Test

@SpringBootTest
class MessagePublisherTest (
    @Autowired private val messagePublisher: MessagePublisher
){

    @Test
    fun publish() {
        messagePublisher.publish("pubtest", "Hello, World!")
    }
}
