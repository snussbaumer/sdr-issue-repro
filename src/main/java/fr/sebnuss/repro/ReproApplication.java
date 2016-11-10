package fr.sebnuss.repro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author snussbaumer
 */

@SpringBootApplication
@EntityScan
public class ReproApplication {

    public static void main(String... args) {
        SpringApplication.run(ReproApplication.class, args);
    }

}
