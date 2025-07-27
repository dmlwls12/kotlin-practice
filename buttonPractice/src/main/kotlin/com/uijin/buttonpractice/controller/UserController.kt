package com.uijin.buttonpractice.controller

import com.uijin.buttonpractice.domain.User
import com.uijin.buttonpractice.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(
    private val userService: UserService
) {
    @PostMapping
    fun saveUser(@RequestBody user: User): User {
        return userService.save(user.name)
    }

    @GetMapping
    fun getAllUsers(): List<User>{
        return userService.findAll()
    }

}