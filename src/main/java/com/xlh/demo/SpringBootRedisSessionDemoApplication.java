package com.xlh.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.session.data.redis.RedisOperationsSessionRepository;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession
public class SpringBootRedisSessionDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRedisSessionDemoApplication.class, args);
    }


//    @Bean
//    public JedisConnectionFactory connectionFactory() throws Exception {
//        return new JedisConnectionFactory();
//    }

//    @Bean
//    public RedisOperationsSessionRepository sessionRepository(
//            @Qualifier("sessionRedisTemplate") RedisOperations<Object, Object> sessionRedisTemplate,
//            ApplicationEventPublisher applicationEventPublisher) {
//        RedisOperationsSessionRepository sessionRepository = new RedisOperationsSessionRepository(
//                sessionRedisTemplate);
//        sessionRepository.setApplicationEventPublisher(applicationEventPublisher);
//        sessionRepository
//                .setDefaultMaxInactiveInterval(this.maxInactiveIntervalInSeconds);
//        if (this.defaultRedisSerializer != null) {
//            sessionRepository.setDefaultSerializer(this.defaultRedisSerializer);
//        }
//
//        String redisNamespace = getRedisNamespace();
//        if (StringUtils.hasText(redisNamespace)) {
//            sessionRepository.setRedisKeyNamespace(redisNamespace);
//        }
//
//        sessionRepository.setRedisFlushMode(this.redisFlushMode);
//        return sessionRepository;
//    }
}
