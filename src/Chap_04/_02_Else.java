package Chap_04;

public class _02_Else {
    public static void main(String[] args) {
        //조건문 If Else
        int hour = 15;
        if (hour < 14) {
            System.out.println("아이스 아메리카노+1");
        } else {
            System.out.println("아이스 아메리카노 (디카페인) +1");}

    //오후 2시 이후이거나 모닝 커피를 마신 경우
        hour = 15;
        boolean morningCoffee = true;
        if ( hour<14 || !morningCoffee )        {
            System.out.println("아이스아메리카노 샷추가");
        } else {
            System.out.println("오곡 라떼");
    }
    }}

