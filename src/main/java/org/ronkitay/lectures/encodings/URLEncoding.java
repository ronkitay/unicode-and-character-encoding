package org.ronkitay.lectures.encodings;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * @author Ron Kitay
 * @since 03-Oct-2021.
 */
public class URLEncoding {

    public static void main(String[] args) {
        demoEncode();
        demoDecode();
    }

    private static void demoEncode() {
        String input = "I'll give you %0 of my earning!";
        String encoded = URLEncoder.encode(input, StandardCharsets.UTF_8);
        System.out.printf("'%s' is encoded as '%s'%n", input, encoded);
    }

    private static void demoDecode() {
        String input = "%5BINFO%5D";
        String decoded = URLDecoder.decode(input, StandardCharsets.UTF_8);
        System.out.printf("'%s' is encoded as '%s'%n", input, decoded);
    }

}
