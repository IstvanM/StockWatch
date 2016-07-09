package com.imeszaros.stockwatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ServerCoreApplication {

    private static final Logger logger = LoggerFactory.getLogger(ServerCoreApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ServerCoreApplication.class, args);
        logger.info("Server core started up.");
    }
}
