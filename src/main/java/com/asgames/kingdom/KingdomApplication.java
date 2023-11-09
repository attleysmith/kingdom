package com.asgames.kingdom;

import com.asgames.kingdom.application.GameRunner;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class KingdomApplication implements CommandLineRunner {

    private final GameRunner gameRunner;

    public static void main(String[] args) {
        SpringApplication.run(KingdomApplication.class, args);
    }

    @Override
    public void run(String... args) {
        gameRunner.run();
    }
}
