package org.myself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Application_Consumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(Application_Consumer_80.class,args);
    }
}
