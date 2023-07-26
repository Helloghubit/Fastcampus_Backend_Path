package Chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        System.out.println("내가 푼 답안");
        int a = 250;
        String[] size = new String[10];
        for (int i = 0; i < size.length; i++) {
            size[i]= String.valueOf(a+5*i);
            System.out.println("사이즈 "+size[i]+" (재고 있음)");
        }
        System.out.println("해답");
        int[] size2 = new int[10];
        for (int i = 0; i < size2.length; i++) {
            size2[i] = 250 + 5*i;
            System.out.println("사이즈 "+size2[i]+" (재고 있음)");

        }
    }
}
