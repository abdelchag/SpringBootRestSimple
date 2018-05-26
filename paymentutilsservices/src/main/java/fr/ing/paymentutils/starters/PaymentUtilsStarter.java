package fr.ing.paymentutils.starters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by ABDELCHAG on 26/05/2018.
 */

@SpringBootApplication
@ComponentScan(value = "fr.ing.paymentutils.services")
public class PaymentUtilsStarter extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PaymentUtilsStarter.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PaymentUtilsStarter.class);
    }
}
