package Chap_04;

public class _10_break {
    public static void main(String[] args) {
        //Break 치킨 집 매일 20마리만 판매. 50명 대기
        int max = 20;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님 주문하신 치킨 나왔습니다");
            if (i == max) {
                System.out.println("금일 재료가 모두 소진되었습니다");
                break;
                //반복문 탈출
            }

        }
        System.out.println("영업을 종료합니다");
        int index = 1;
        while (index <= 50) {
            System.out.println(index + "번 손님 주문하신 치킨 나왔습니다.");
            if (index == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            index++;
        }
    }
}
