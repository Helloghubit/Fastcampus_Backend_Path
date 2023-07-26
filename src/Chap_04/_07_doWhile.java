package Chap_04;

public class _07_doWhile {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;
        int height = 2;
        while(distance>move+height){
            System.out.println("현재 이동 거리는 " +move+ "m입니다");
            System.out.println("발차기를 계속합니다");
        move+=3;}
        System.out.println("도착 완료.");
distance = 5;
move = 0;
height=5;
        do {
            System.out.println("현재이동거리는"+move+"m입니다");
            System.out.println("발차기를 계속합니다");
            move+=5;
        }while(distance>move+height);
        System.out.println("도착했습니다.");

        }
    }
