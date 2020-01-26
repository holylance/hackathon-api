package com.example.demo.controller

import com.example.demo.model.TestDTO
import com.example.demo.model.User
import com.example.demo.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

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
}
