package com.demo.build.reactive.service;

import com.demo.build.reactive.adapter.ProducerServiceAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ConsumerService {

    @Autowired
    private ProducerServiceAdapter producerServiceAdapter;

    public Mono<String> getEmployeeName() {

        return producerServiceAdapter.reactiveRestCall();
    }
}
