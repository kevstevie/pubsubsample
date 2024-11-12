package com.kev.pubsub.pubsub

import org.springframework.data.redis.core.RedisTemplate
import org.springframework.stereotype.Component

@Component
class MessagePublisher(
    private val redisTemplate: RedisTemplate<String, String>,
){

    fun publish(topic: String, message: String) {
        redisTemplate.convertAndSend(topic, message)
    }
}
