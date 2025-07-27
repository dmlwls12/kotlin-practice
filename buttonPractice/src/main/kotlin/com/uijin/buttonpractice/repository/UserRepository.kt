package com.uijin.buttonpractice.repository

import com.uijin.buttonpractice.domain.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long>