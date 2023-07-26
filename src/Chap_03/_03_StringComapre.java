package Chap_03;

public class _03_StringComapre {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.equals("Java"));
        System.out.println(s2.equalsIgnoreCase("python")); //대소문자 구분 x

        //문자열 비교 심화
        s1 = "1234"; //벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // 내용
        System.out.println(s1 == s2); // 참조

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // 내용 자체의 동일성
        System.out.println(s1 == s2); //false가 나오는 이유 : 참조가 다르기 때문. =>내용 비교를 위해서는 equals를 이용하는 것이 바람직.

    }
}
