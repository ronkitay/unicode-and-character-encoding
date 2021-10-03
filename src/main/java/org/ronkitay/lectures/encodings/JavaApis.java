package org.ronkitay.lectures.encodings;

import java.nio.charset.StandardCharsets;

/**
 * @author Ron Kitay
 * @since 22-Sep-2021.
 */
public class JavaApis {

    public static void main(String[] args) {
        demoStringToBytes();
//        demoBytesToString();
    }

    private static void demoBytesToString() {
        byte[] exampleAsciiOrUtf8OrIso8859 = new byte[] {
                48,  // Byte representation of '0'
                49,  // Byte representation of '1'
                50   // Byte representation of '2'
        };
        System.out.println(new String(exampleAsciiOrUtf8OrIso8859, StandardCharsets.US_ASCII));
        System.out.println(new String(exampleAsciiOrUtf8OrIso8859, StandardCharsets.UTF_8));
        System.out.println(new String(exampleAsciiOrUtf8OrIso8859, StandardCharsets.ISO_8859_1));

        byte[] exampleAsciiOrUtf16BE = new byte[] {
                0, 48, // Byte representation of '0'
                0, 49, // Byte representation of '1'
                0, 50  // Byte representation of '2'
        };
        System.out.println(new String(exampleAsciiOrUtf16BE, StandardCharsets.UTF_16BE));

        byte[] exampleAsciiOrUtf16LE = new byte[] {
                48, 0, // Byte representation of '0'
                49, 0, // Byte representation of '1'
                50, 0  // Byte representation of '2'
        };
        System.out.println(new String(exampleAsciiOrUtf16LE, StandardCharsets.UTF_16LE));
    }

    private static void demoStringToBytes() {
        String exampleString = "012";

        System.out.println(BytesHelper.printBytes(exampleString.getBytes(StandardCharsets.US_ASCII)));
        System.out.println(BytesHelper.printBytes(exampleString.getBytes(StandardCharsets.ISO_8859_1)));
        System.out.println(BytesHelper.printBytes(exampleString.getBytes(StandardCharsets.UTF_8)));
        System.out.println(BytesHelper.printBytes(exampleString.getBytes(StandardCharsets.UTF_16BE)));
        System.out.println(BytesHelper.printBytes(exampleString.getBytes(StandardCharsets.UTF_16LE)));

    }

}
