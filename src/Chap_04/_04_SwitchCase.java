package Chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        //Switch case

        //석차에 따른 장학금 지급

        int ranking =1;
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking==2) {
            System.out.println("반액 장학금");
        } else if (ranking==3) {
            System.out.println("부분 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회완료");

        //Switch case 이용 하는 방법
        ranking = 3;
        switch ( ranking) {
            case 1:
                System.out.println("전액장학금");
                break;
            case 2:
                System.out.println("반액장학금");
                break;
            case 3:
                System.out.println("반액장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        //break가 없는경우
        ranking = 2;
        switch ( ranking) {
            case 1:
                System.out.println("전액장학금");
                break;
            case 2:
                System.out.println("2등입니다");
            case 3:
                System.out.println("3등입니다");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");

        //중고상품의 등급에 따른 가격을 책정 (1급 : 최상, 4급 최하)
        int grade = 1;
        int price = 7000;
        switch (grade) {
            case 1 :
                price +=1000;
            case 2 :
                price +=1000;
            case 3 :
                price +=1000;
                break;
            default :
                price -=1000;
        }
        System.out.println(price);
    }
}
//범위에 해당한 경우 if, 점추정치에 해당하는 경우 swithcase 이용
