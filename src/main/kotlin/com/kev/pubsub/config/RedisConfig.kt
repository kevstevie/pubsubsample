package com.kev.pubsub.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.data.redis.listener.RedisMessageListenerContainer
import org.springframework.data.redis.serializer.StringRedisSerializer

@Configuration
class RedisConfig {

    @Bean
    fun connectionFactory() = LettuceConnectionFactory()

    @Bean
    fun messageListenerContainer() = RedisMessageListenerContainer().apply {
        setConnectionFactory(connectionFactory())
    }

    @Bean
    fun redisTemplate() = RedisTemplate<String, String>().apply {
        connectionFactory = connectionFactory()
        keySerializer = StringRedisSerializer()
        valueSerializer = StringRedisSerializer()
    }
}
