public class data_types {

    public static void main(String[] args) {
        // Integer types: byte, short, int, long - used for whole numbers
        // Binary (2), Octal (8), Hexadecimal(16) Number System
        byte b = 5;
        short s = 10;
        int i = 4000;
        long l = 10_000_000; // Use underscore in numeric literals for readability

        // Example of integer literals: binary (0b...), octal (0...), hexadecimal (0x...).
        byte binary = 0b101; // 101 is binary form of 5
        byte octal = 05;
        byte hexadecimal = 0xA; // A = 10 in hexadecimal

        // Real Numbers
        float f = 5.52f; // Float literals require suffix 'f' or 'F'
        double d = 6.022e23; // exponent form write => 6.022 * 10^23

        // Errors -> double d = 6.022_e23, 6.022_e23, 6._022e23, 6_.022e23

        // Characters
        char c = 'a'; // a = integer --> binary (this is the way to store character)

        // Boolean
        boolean bool = false;

        System.out.println("Integers value ---> " + b + " , " + s + " , " + i + " , " + l);
        System.out.println("Floating value ---> " + f + " , " + d);
        System.out.println("Character ---> " + c); // convert binary --> character
        System.out.println("Boolean ---> " + bool);
        System.out.println("Binary ---> " + binary);
        System.out.println("Octal --> " + octal);
        System.out.println("Hexadecimal ---> " + hexadecimal);

    }
}