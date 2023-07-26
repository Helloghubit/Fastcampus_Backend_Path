package Chap_04;

public class _06_While {
    public static void main(String[] args) {
        //횟수가 정해지지 않은 반복문
        int distance  = 25;
        int move = 0;
        while (distance>=move)
        {System.out.println("발차기를 계속 합니다");
        System.out.println("현재 이동 거리는 "+move+"m입니다");
        move += 5;}
        System.out.println("도착 완료하였습니다");
    }
}
