package Chap_04;

public class _05_for {
    public static void main(String[] args) {
        //반복문 For
        System.out.println("어서오세요, 나코입니다.");
        //또다른 손님이 들어오면?
        System.out.println("어서오세요, 나코입니다.");
        System.out.println("어서오세요, 나코입니다.");
        //매장 이름이 바뀌면?
        System.out.println("환영합니다, 코나입니다");
        System.out.println("환영합니다, 코나입니다");
        System.out.println("환영합니다, 코나입니다");
        System.out.println("환영합니다, 코나입니다");

        //반복문 사용 For
        //for (선언 ex: int i = 0 ; 조건 i<10 ; 증감i++) {}
        for (int i = 0; i<10; i++){
            System.out.println("안녕하세요10번만 인사할게요 18");}

        //짝수만 출력,ln을 제외하면 줄바꿈 x
        for (int i = 0; i < 10; i+=2) {
            System.out.print(i);

        }
        System.out.println();
        for (int i = 1; i < 10; i+=2) {
            System.out.print(i);
              }
        System.out.println();
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum +=i;}
            //System.out.println("현재까지 총합은"+sum+"입니다");}
            System.out.println("1부터 10까지의 합은 "+sum+"입니다");

        }
    }
