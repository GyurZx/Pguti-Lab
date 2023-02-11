package org.example.ChatGPT;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
//import sun.misc.BASE64Encoder;

public class MessageEncryptionAES {

    private static final String ALGORITHM = "AES";
    private static final byte[] KEY = "MySuperSecretKey".getBytes();

    public static String encrypt(String message) throws Exception {
        Key key = new SecretKeySpec(KEY, ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedMessage = cipher.doFinal(message.getBytes());
        //return new BASE64Encoder().encode(encryptedMessage);
        return "";
    }

    public static void main(String[] args) {
        try {
            String message = "This is the message to be encrypted.";
            String encryptedMessage = encrypt(message);
            System.out.println("Original Message: " + message);
            System.out.println("Encrypted Message: " + encryptedMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}







