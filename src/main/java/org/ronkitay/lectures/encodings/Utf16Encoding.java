package org.ronkitay.lectures.encodings;

import java.nio.charset.StandardCharsets;

import static org.ronkitay.lectures.encodings.BytesHelper.showBytes;

/**
 * @author Ron Kitay
 * @since 10-Sep-2021.
 */
public class Utf16Encoding {

    public static void main(String[] args) {
        demoStrings();
        demoUtf16FromAscii();
    }

    private static void demoStrings() {
        demoStringAsUtf16("ABC");
        demoStringAsUtf16("אבג");
        demoStringAsUtf16("🤦🏽‍️");
        demoStringAsUtf16("😀");
    }

    private static void demoStringAsUtf16(String string) {
        System.out.printf("The string '%s' is represented as %s. Its length is %d characters.%n", string, showBytes(string, StandardCharsets.UTF_16),
                string.length());
    }

    private static void demoUtf16FromAscii() {
        byte[] asciiBytes = "Hello World".getBytes(StandardCharsets.US_ASCII);
        System.out.println(new String(asciiBytes, StandardCharsets.UTF_16));
    }

}
