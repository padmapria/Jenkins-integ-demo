package com.example.jenkinsintegration;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsintegrationApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(JenkinsintegrationApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Test case logger executing !!!!!!!");
        assertEquals(true, true);
    }

}
