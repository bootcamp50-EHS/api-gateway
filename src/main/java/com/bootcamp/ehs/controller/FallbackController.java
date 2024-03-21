package com.bootcamp.ehs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @GetMapping("/fallback/customers")
    public Mono<String> customersFallback() {
        return Mono.just("El servicio de Clientes no está disponible en este momento. Por favor, inténtalo más tarde.");
    }

    @GetMapping("/fallback/products")
    public Mono<String> productsFallback() {
        return Mono.just("El servicio de Producto Bancario no está disponible en este momento. Por favor, inténtalo más tarde.");
    }

    @GetMapping("/fallback/accounts")
    public Mono<String> accountsFallback() {
        return Mono.just("El servicio de Cuentas Bancarias no está disponible en este momento. Por favor, inténtalo más tarde.");
    }

    @GetMapping("/fallback/credits")
    public Mono<String> creditsFallback() {
        return Mono.just("El servicio de Creditos Bancarios no está disponible en este momento. Por favor, inténtalo más tarde.");
    }
}
