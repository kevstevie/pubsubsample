package com.kev.pubsub.pubsub

import org.springframework.data.redis.connection.Message
import org.springframework.data.redis.connection.MessageListener
import org.springframework.stereotype.Component

@Component
class MessageSubscriber: MessageListener {

    override fun onMessage(message: Message, pattern: ByteArray?) {
        println(message.toString())
    }
}
