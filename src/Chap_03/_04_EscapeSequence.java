package Chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");
        
        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t띄어쓰기가 아닌 탭효과를 주는 명령어
        System.out.println("해물파전\t9,000");
        System.out.println("김치전\t9,000");
        System.out.println("부추전\t9,000");

        // 폴더 경로를 활용하는 경우 역슬래시 두번이용
        System.out.println("C:\\Program Files\\Java");
        
        //단비가 "냐옹"이라고 했어요
        System.out.println("단비가 \"냐용\" 이라고 했어요");
        //단비가 '냐옹'이라고 했어요
        System.out.println("단비가 \'냐용\' 이라고 했어요");
        System.out.println("단비가 '냐용' 이라고 했어요");

        char c = 'A';
        System.out.println(c);
        c = '\'';
        System.out.println(c);

                
    }
}
