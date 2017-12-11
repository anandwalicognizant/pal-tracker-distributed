package io.pivotal.pal.tracker.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by aw169 on 12/11/17.
 */
@EnableEurekaServer
@SpringBootApplication
public class App {

    public static void main(String [] args){
        SpringApplication.run(App.class);
    }
}
