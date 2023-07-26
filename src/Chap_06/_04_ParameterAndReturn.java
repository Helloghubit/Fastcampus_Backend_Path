package Chap_06;

public class _04_ParameterAndReturn {
    //    public static void power(int number){
//        int result = number* number;
//        System.out.println(number + " 의 2 승은 " + result);
//    }
    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

    //    public static void powerByExp(int number,int exponent){
//        int result = 1;
//        for (int i = 0; i < exponent; i++) {
//            result *= number;
//        }
//        System.out.println(result);
//    }
    public static int powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        int powerresult = getPower(3);
        System.out.println(powerresult);
        int powerByExpresult = powerByExp(3,5);
        System.out.println(powerByExpresult);
    }
}


