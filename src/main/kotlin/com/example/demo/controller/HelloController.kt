package com.example.demo.controller

import com.example.demo.model.TestDTO
import com.example.demo.model.User
import com.example.demo.repository.UserRepository
import org.springframework.web.bind.annotation.*

@RestController
class HelloController(
    private val userRepo: UserRepository
) {
    @GetMapping("/helloworld")
    @ResponseBody
    fun greeting(): TestDTO {
        return TestDTO(1.toBigInteger(), "name")
    }

    @GetMapping("/user/all")
    @ResponseBody
    fun getAllUser(): List<User> {
        return userRepo.findAll()
    }

    @PostMapping("/login")
    @ResponseBody
    fun login(
            @RequestHeader("username") username: String,
            @RequestHeader("password") password: String
    ): User {
        val user = userRepo.findByUserName(username)
        return if (user.password == password)
            user
        else
            User()
    }
}
