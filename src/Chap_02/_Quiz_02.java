package Chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int x = 120;
        int y = 115;
        String max = (x>y) ? "키가 " +y+ "cm이므로 탑승이 불가능합니다" : "키가 "+y+"cm이므로 탑승이 가능합니다";
                System.out.println(max);
        y = 121;
        max = (x>y) ? "키가 " +y+ "cm이므로 탑승이 불가능합니다" : "키가 "+y+"cm이므로 탑승이 가능합니다";
        System.out.println(max);

    }
}
