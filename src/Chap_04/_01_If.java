package Chap_04;

public class _01_If {
    public static void main(String[] args) {
//        조건문 if 한가지 문장은 중괄호 생략 두가지 문장은 중괄호 포함
        int hour = 15; //오전 10시
        if ( hour <14) {
            System.out.println("아이스 아메리카노 + 1");
            System.out.println("샷추가");}
        System.out.println("커피 주문 완료");

        //오후 2시 이전, 모닝 커피를마시지 않은 경우?
        hour = 12;
        boolean morningCoffee = false; //모닝커피
        if (hour < 14 && morningCoffee == false) {
            System.out.println("아아 +2");
        if (hour < 14 && morningCoffee == true) {
            System.out.println("아아 + 1");

    }
}
        hour =15;
    morningCoffee = true;
    if (hour>=14 || morningCoffee == true) {
        System.out.println("아이스 아메리카노 (디카페인) +1");}
        System.out.println("커피 주문완료");
    }}