package Chap_06;

public class _06_WhenToUse {public static int getPower(int number) {
    int result = number * number;
    return result;
}
        public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number * number;
    }
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
}