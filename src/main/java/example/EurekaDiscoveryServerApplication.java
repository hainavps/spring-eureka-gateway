package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoveryServerApplication {

    public static void main(String[] args) {
        System.out.println("welcome to the jar..");
        SpringApplication.run(EurekaDiscoveryServerApplication.class, args);
    }

}
