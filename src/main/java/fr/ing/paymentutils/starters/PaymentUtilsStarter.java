package fr.ing.paymentutils.starters;

import fr.ing.paymentutils.services.EncryptionResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by ABDELCHAG on 26/05/2018.
 */

@SpringBootApplication
@ComponentScan(basePackages = "fr.ing.paymentutils.services")
public class PaymentUtilsStarter {

    public static void main(String[] args) {
        SpringApplication.run(PaymentUtilsStarter.class, args);
    }
}
