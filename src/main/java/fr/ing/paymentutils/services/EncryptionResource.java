package fr.ing.paymentutils.services;

import fr.ing.paymentutils.fr.ing.paymentutils.utils.EncryptionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import javax.xml.ws.http.HTTPException;

/**
 * Created by ABDELCHAG on 26/05/2018.
 */
@RestController
@RequestMapping(path = "/")
public class EncryptionResource {

    @RequestMapping(value = "/{iban}/encrypt",method= RequestMethod.GET)
    public ResponseEntity<String> encrypt(@PathVariable(name = "iban") String iban) {

        try {
            return new ResponseEntity<String>(EncryptionUtils.encrypt(iban), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }
}
