package Chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        int score = 93;
        System.out.println((float) score);
        score = 93 + (int) 98.8;
        System.out.println(score);

        String s1 = String.valueOf(93);
        System.out.println(s1);
        s1 = Integer.toString(93);

        int i = Integer.parseInt("93");
        System.out.println(i);}
}
