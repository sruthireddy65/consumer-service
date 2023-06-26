package com.demo.build.reactive.controller;

import com.demo.build.reactive.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/getName")
    public Mono<String> getEmployeeName() {
        return consumerService.getEmployeeName();
    }
}
