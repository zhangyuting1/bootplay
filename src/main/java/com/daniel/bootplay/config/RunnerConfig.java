package com.daniel.bootplay.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dipengfei on 16/05/2017.
 */
@Configuration
public class RunnerConfig {

    @Bean
    public CommandLineRunner dataInitRunner() {

        return args -> {
            System.out.println("hello");
            System.out.println("world");
            System.out.println("Rainy");

            System.out.println("Daniel");
        };
    }
}
