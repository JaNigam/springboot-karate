package com.jayant.store.bdd;

import com.intuit.karate.junit5.Karate;
import com.jayant.store.StoreApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;

@SpringBootTest(classes = StoreApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestLocalRunner {

    @Value("${local.server.port}")
    private int port;

    @Karate.Test
    Karate testUserApi() {
        System.setProperty("karate.server.port", String.valueOf(port));
        return Karate.run("UserControllerTest").relativeTo(getClass());
    }
}
