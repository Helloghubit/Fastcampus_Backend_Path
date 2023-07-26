package Chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean 김치찌개 = true;
        boolean 된장찌개 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 된장찌개 || 제육볶음); //하나라도 true 이면 true
        System.out.println(김치찌개 && 된장찌개 && 제육볶음); //하나라도 false 이면 false
        System.out.println((5>3) && (3>5));
        System.out.println((5>3) || (3>5));
        //
    }
}
