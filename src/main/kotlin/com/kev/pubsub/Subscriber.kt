package com.kev.pubsub

import com.kev.pubsub.pubsub.MessageSubscriber
import jakarta.annotation.PostConstruct
import org.springframework.data.redis.listener.ChannelTopic
import org.springframework.data.redis.listener.RedisMessageListenerContainer
import org.springframework.stereotype.Component

@Component
class Subscriber(private val messageListenerContainer: RedisMessageListenerContainer) {

    @PostConstruct
    fun subscribe() {
        messageListenerContainer.addMessageListener(
            MessageSubscriber(), ChannelTopic("topictest")
        )
    }
}
