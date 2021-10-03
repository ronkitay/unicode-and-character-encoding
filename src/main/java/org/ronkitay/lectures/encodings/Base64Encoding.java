package org.ronkitay.lectures.encodings;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author Ron Kitay
 * @since 03-Oct-2021.
 */
public class Base64Encoding {

    public static void main(String[] args) {
        demoEncoding();
        demoDecoding();
    }

    private static void demoEncoding() {
        byte[] encoded = Base64.getEncoder().encode("ABC".getBytes(StandardCharsets.UTF_8));
        String prettyEncoded = new String(encoded, StandardCharsets.US_ASCII);
        System.out.printf("'ABC' encoded in Base64 is: %s%n", prettyEncoded);
    }

    private static void demoDecoding() {
        byte[] decoded = Base64.getDecoder().decode("QUJD");
        String prettyDecoded = new String(decoded, StandardCharsets.UTF_8);
        System.out.printf("'QUJD' decoded from Base64 is: %s%n", prettyDecoded);
    }

}
