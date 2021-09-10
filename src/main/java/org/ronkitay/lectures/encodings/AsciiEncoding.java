package org.ronkitay.lectures.encodings;

import java.nio.charset.StandardCharsets;

/**
 * @author Ron Kitay
 * @since 10-Sep-2021.
 */
public class AsciiEncoding {

    public static void main(String[] args) {
        backspaceDemo();
        spaceDemo();
        crlfDemo();
        lettersDemo();
    }


    private static void backspaceDemo() {
        var demoBackspaceWithoutOverwrite = new String(new byte[] {'h', 'e', 'l', 'l', 'o', 8, 8}, StandardCharsets.US_ASCII);
        System.out.printf("The string 'hello\\8\\8' is printed as: '%s' even though it has %d characters.%n",
                demoBackspaceWithoutOverwrite,
                demoBackspaceWithoutOverwrite.length());

        var demoBackspaceWithOverwrite = new String(new byte[] {'h', 'e', 'l', 'l', 'o', 8, 8, 'p'}, StandardCharsets.US_ASCII);
        System.out.printf("The string 'hello\\8\\8p' is printed as: '%s' even though it has %d characters.%n",
                demoBackspaceWithOverwrite,
                demoBackspaceWithOverwrite.length());
    }

    private static void spaceDemo() {
        var demoSpaceAsDecimal = new String(new byte[] {'h', 'e', 'l', 'l', 'o', 32, 'w', 'o', 'r', 'l', 'd'}, StandardCharsets.US_ASCII);
        System.out.printf("The string 'hello\\30world' is printed as: '%s'%n",
                demoSpaceAsDecimal);

        var demoSpaceAsHexaDecimal = new String(new byte[] {'h', 'e', 'l', 'l', 'o', 0x20, 'w', 'o', 'r', 'l', 'd'}, StandardCharsets.US_ASCII);
        System.out.printf("The string 'hello\\0x20world' is printed as: '%s'%n",
                demoSpaceAsHexaDecimal);

    }

    private static void crlfDemo() {
        var carrigeReturnDemo = new String(new byte[] {'h', 'e', 'l', 'l', 'o', 13, 'w', 'o', 'r', 'l', 'd'}, StandardCharsets.US_ASCII);
        System.out.printf("The string 'hello\\13world' is printed as:%n%s%neven though it has %d characters.%n",
                carrigeReturnDemo,
                carrigeReturnDemo.length());
        System.out.println("----------------------------------------");
        var lineFeedDemo = new String(new byte[] {'h', 'e', 'l', 'l', 'o', 10, 'w', 'o', 'r', 'l', 'd'}, StandardCharsets.US_ASCII);
        System.out.printf("The string 'hello\\10world' is printed as:%n%s%nThis may work differently depending on the platform!.%n",
                lineFeedDemo);
    }


    private static void lettersDemo() {
        byte lowercaseA = 97;
        byte uppercaseA = 65;
        var lowercaseLettersDemo = new String(new byte[]{lowercaseA, (byte) (lowercaseA + 1), (byte) (lowercaseA + 2)},
                StandardCharsets.US_ASCII);
        System.out.printf("Lowercase letters: %s%n", lowercaseLettersDemo);

        var uppercaseLettersDemo = new String(new byte[]{uppercaseA, (byte) (uppercaseA + 1), (byte) (uppercaseA + 2)},
                StandardCharsets.US_ASCII);
        System.out.printf("Uppercase letters: %s%n", uppercaseLettersDemo);

        var toLowerDiff = lowercaseA - uppercaseA;
        var toLowerCaseDemo = new String(new byte[]{(byte) (uppercaseA + toLowerDiff), (byte) (uppercaseA + 1 + toLowerDiff), (byte) (uppercaseA + 2 + toLowerDiff)},
                StandardCharsets.US_ASCII);
        System.out.printf("Uppercase letters as lowercase: %s%n", toLowerCaseDemo);
    }

}
