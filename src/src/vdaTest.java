package src;

public class vdaTest {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a = " + a);
        int b;
        b = a;
        System.out.println("b = " + b);
        int c = b * 10;
        System.out.println("c = " + c);
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }
        System.out.println("sum = " + sum);

        int x = 10;
        int y = 20;
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + ", y = " + y);
    }
}
