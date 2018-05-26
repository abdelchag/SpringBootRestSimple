package fr.ing.paymentutils.fr.ing.paymentutils.utils;

/**
 * Created by ABDELCHAG on 26/05/2018.
 */
public class EncryptionUtils {


    public static String encrypt(String iban) throws Exception {
        if(iban.equals("test"))
            throw new Exception("iban invalid");
        return iban + "ENCRYPT";
    }

}
