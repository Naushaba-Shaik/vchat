package com.videocall.vchat;

import java.util.Vector;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestBody;

// import javax.crypto.Cipher;
// import javax.crypto.SecretKey;
// import javax.crypto.spec.SecretKeySpec;
// import org.apache.tomcat.util.codec.binary.Base64;

@RestController
public class VchatController {

    // @PostMapping("/validate")
    // public String validateMessage(@RequestBody MessageValidationRequest request)
    // {
    // String encryptedMessage = request.getEncryptedMessage();
    // String secretKey = "YourKnownStandardSecretKey";
    // String originalMessage = "YourOriginalMessage";

    // boolean isValid = validateMessage(encryptedMessage, secretKey,
    // originalMessage);

    // if (isValid) {
    // return "Message is valid";
    // } else {
    // return "Message is invalid";
    // }
    // }

    // public static boolean validateMessage(String encryptedMessage, String
    // secretKey, String originalMessage) {
    // try {
    // // Decode the base64-encoded secret key
    // byte[] decodedKey = Base64.decodeBase64(secretKey);

    // // Create a SecretKey object from the decoded key bytes
    // SecretKey key = new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES");

    // // Create a Cipher instance and initialize it for decryption
    // Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
    // cipher.init(Cipher.DECRYPT_MODE, key);

    // // Decode the base64-encoded encrypted message
    // byte[] encryptedBytes = Base64.decodeBase64(encryptedMessage);

    // // Decrypt the encrypted message
    // byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

    // // Convert the decrypted bytes to a String
    // String decryptedMessage = new String(decryptedBytes);

    // // Validate the decrypted message with the original message
    // return decryptedMessage.equals(originalMessage);
    // } catch (Exception e) {
    // // Handle any exceptions that occur during decryption/validation
    // e.printStackTrace();
    // return false;
    // }
    // }
    // private String[] List={};
    Vector<String> list = new Vector<String>();

    @PostMapping("/post")
    void post(@RequestBody Id id) {
        String s = id.getId();
        list.add(s);
    }

    @PostMapping("/delete")
    void delete(@RequestBody Id id) {
        String s = id.getId();
        list.remove(s);
    }
}
