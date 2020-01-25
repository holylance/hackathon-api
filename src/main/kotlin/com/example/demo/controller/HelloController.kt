package com.example.demo.controller

import com.example.demo.model.TestDTO
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/helloworld")
    @ResponseBody
    fun greeting(): TestDTO {
        return TestDTO(1.toBigInteger(), "name")
    }
}
