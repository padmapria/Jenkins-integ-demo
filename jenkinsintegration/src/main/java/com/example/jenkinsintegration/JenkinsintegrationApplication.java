package com.example.jenkinsintegration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsintegrationApplication {

    public static Logger logger = LoggerFactory.getLogger(JenkinsintegrationApplication.class);

    @PostConstruct
    public void init(){
        logger.info("init executed **");
    }

    public static void main(String[] args) {
        logger.info("** Main method executed **");
        SpringApplication.run(JenkinsintegrationApplication.class, args);
    }

}
