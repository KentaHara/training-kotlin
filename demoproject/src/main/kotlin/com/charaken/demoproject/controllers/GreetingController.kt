package com.charaken.demoproject.controllers

import com.charaken.demoproject.Greeting
import java.util.concurrent.atomic.AtomicLong
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    val counter: AtomicLong = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(): Greeting {
        return Greeting(counter.incrementAndGet(), String.format("Hello, %s", "hoge"))
    }
}
