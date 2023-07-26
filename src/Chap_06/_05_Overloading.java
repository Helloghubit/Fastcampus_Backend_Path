package Chap_06;

public class _05_Overloading {
    public static int getPower(int number) {
    int result = number * number;
    return result;
}
//메소드 오버로딩 =>동명이인 만들기
    //전달값의 타입,갯수가 다른경우
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

    public static void main(String[] args) {
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(3,3));
    }
}
