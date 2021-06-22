package com.dcheld.api;

import com.dcheld.api.utils.PasswordUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiRestfullSprignBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiRestfullSprignBootApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(){
        return args -> {
            String senhaEncoded = PasswordUtils.generateBcrypt("1234");
            System.out.println(senhaEncoded);

            senhaEncoded = PasswordUtils.generateBcrypt("1234");
            System.out.println(senhaEncoded);

            System.out.println(PasswordUtils.isValidPassword("1234", senhaEncoded));
        };
    }
}
