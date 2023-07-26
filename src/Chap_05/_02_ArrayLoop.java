package Chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees = {"아메리카노", "카페모카", "카페라떼", "카푸치노"};

        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + "하나");

        }
        System.out.println("주세요.");
        System.out.println();
        //배열의 길이를 이용한 순회 foreach치면 자동완성
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + "하나");
        }
        System.out.println("주세요.");
        System.out.println();
        for (String coffee : coffees) {
            System.out.println(coffee + "하나");
        }
        System.out.println("주세요");
    }
}