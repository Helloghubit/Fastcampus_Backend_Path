package src;

public class binaryTest {
    public static void main(String[] args) {
        int a = 10;
        float f = 35.6f;
        boolean b = false;
        char c = 'A';
        String s = "APPLE";
        // 69 를 10진수 2진수 8진수 16진수 출력
        int decimal = 69;
        System.out.println("decimal = " + decimal);
        int binary = 0b01000101;
        System.out.println("binary = " + binary);
        int octal = 0105;
        System.out.println("octal = " + octal);
        int hexa = 0x45;
        System.out.println("hexa = " + hexa);
        decimal = 123;
        System.out.println("decimal = " + decimal);
        binary = 0b01111011;
        System.out.println("binary = " + binary);
        octal = 0173;
        System.out.println("octal = " + octal);
        hexa = 0x7b;
        System.out.println("hexa = " + hexa);
    }
}
