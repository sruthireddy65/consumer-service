package com.demo.build.reactive.adapter;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class ProducerServiceAdapter {

    private final WebClient webClient;

    public ProducerServiceAdapter(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8081").build();
    }

    public Mono<String> reactiveRestCall() {
        return this.webClient.get().uri("/getName")
                .retrieve().bodyToMono(String.class);
    }
}
