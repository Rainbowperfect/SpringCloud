package org.myself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ImportResource(locations = {"classpath:spring-trans.xml"})

public class Application8001 {
    public static void main(String[] args) {
        SpringApplication.run(Application8001.class,args);
    }
}
