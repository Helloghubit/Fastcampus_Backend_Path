package Chap_06;

public class _07_VariableScope {
    public static void methodA(){
        System.out.println("number");//main에서만 사용가능
    }
    public static void methodB(){
        int result = 3;//지역변수
    }
    public static void main(String[] args) {
        int number = 3;
    }
}
