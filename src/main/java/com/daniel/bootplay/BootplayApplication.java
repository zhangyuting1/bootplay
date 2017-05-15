package com.daniel.bootplay;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootplayApplication {


    @Bean
    public CommandLineRunner dataInitRunner() {

        return args -> {

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(BootplayApplication.class, args);
    }
}
