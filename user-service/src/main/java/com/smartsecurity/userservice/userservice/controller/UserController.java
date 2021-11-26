package com.smartsecurity.userservice.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    private Mono<String> getOk() {
        return Mono.just("ok");
    }
}
