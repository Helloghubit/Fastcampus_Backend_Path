package Chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        //조건문 ElseIf

        // 어떤 메뉴가 있으면 + 1
        //또는 다른 메뉴가 있으면 +1

        boolean icedAmericano = false;
        boolean caffeLatte = true;
        if(icedAmericano){
            System.out.println("아이스아메리카노 +1");}
        else if (caffeLatte)
            System.out.println("카페라떼 +1");
        else {
            System.out.println("아이스 아메리카노 +1");}
        System.out.println("커피 주문 완료 #1");

        //else if 는 여러번 사용 가능

        icedAmericano = false;
        caffeLatte = false;
        boolean orangeJuice = true;
        if(icedAmericano){
            System.out.println("아이스아메리카노 +1");}
        else if (caffeLatte)
            System.out.println("카페라떼 +1");
        else if (orangeJuice)
            System.out.println("오렌지 주스 +1");
        else {
            System.out.println("아이스 아메리카노 +1");}
        System.out.println("커피 주문 완료 #2");


        //else는 생략 가능
        icedAmericano = false;
        caffeLatte = false;
        orangeJuice = false;
        if(icedAmericano){
            System.out.println("아이스아메리카노 +1");}
        else if (caffeLatte)
            System.out.println("카페라떼 +1");
        else if (orangeJuice)
            System.out.println("오렌지 주스 +1");
       System.out.println("커피 주문 완료 #3");
        }
    }

