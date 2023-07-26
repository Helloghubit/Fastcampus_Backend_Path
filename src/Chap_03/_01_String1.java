package Chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length()); //29

        //대소문자 변환
        System.out.println(s.toUpperCase()); //대문자로
        System.out.println(s.toLowerCase()); //소문자로

        //포함관계
        System.out.println(s.contains("java")); //포함되면 true
        System.out.println(s.contains("C#"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.indexOf("C#"));
        System.out.println(s.indexOf("and"));
        System.out.println(s.lastIndexOf("and"));
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작되면 true 아니면 false
        System.out.println(s.endsWith("."));
    }
}
