package com.uijin.buttonpractice.service

import com.uijin.buttonpractice.domain.User
import com.uijin.buttonpractice.repository.UserRepository
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class UserService (

    private val userRepository: UserRepository
) {
    private val logger = LoggerFactory.getLogger(UserService::class.java)
    fun save(name: String): User {
        logger.info("==========저장할 사용자 이름: $name==============")
        val user = userRepository.save(User(name = name))
        logger.info("==========저장된 사용자: $user ===========")
        return user
    }

    fun findAll(): List<User>{
        return userRepository.findAll()
    }
}