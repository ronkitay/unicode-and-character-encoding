package org.ronkitay.lectures.encodings;

import java.nio.charset.StandardCharsets;

import static org.ronkitay.lectures.encodings.BytesHelper.showBytes;

/**
 * @author Ron Kitay
 * @since 10-Sep-2021.
 */
public class Iso8859Encoding {

    public static void main(String[] args) {
        demoStringAsIso8859("ABC");
        demoStringAsIso8859("אבג");
        demoStringAsIso8859("🤦🏽‍️");
        demoStringAsIso8859("😀");
    }

    private static void demoStringAsIso8859(String string) {
        System.out.printf("The string '%s' is represented as %s. Its length is %d characters.%n", string, showBytes(string, StandardCharsets.ISO_8859_1),
                string.length());
    }
}
