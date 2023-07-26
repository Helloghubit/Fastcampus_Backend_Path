package Chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "권택민";
        int hour = 6;

        System.out.println(name + "님, 배송이 시작됩니다");
        System.out.println(name + "님, " + hour + "시 도착예정입니다");
        
        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균점수는" + score + "점입니다");
        System.out.println("학점은 " + grade + "입니다");

        boolean pass = true;
        System.out.println("이번시험에 합격했을까요?" + pass);
        double d = 3.14123341231;
        float f = 3.14123124124f;
        System.out.println(d);
        System.out.println(f);
        long l = 10000000000000l;
        System.out.println(l);
    }
}
