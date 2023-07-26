package Chap_05;

public class _01_Array {
    public static void main(String[] args) {
        String coffeeJohn = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "카페라떼";
        String coffeeTyson = "카푸치노";

        //배열 선언 첫 번째 방법
        //String[] coffees = new String[4];

        //두번째 방법
        //String coffees[] = new String[4];
//        coffees[0] = "아메리카노";
//        coffees[1] = "카페모카";
//        coffees[2] = "카페라떼";
//        coffees[3] = "카푸치노";

        //세번째 방법
        //String[] coffees = new String[] {"아메리카노","카페모카","카페라떼","카푸치노"};

        //네번째 방법
        String[] coffees = {"아메리카노","카페모카","카페라떼","카푸치노"};
        System.out.print(coffees[0] + " 하나,");
        System.out.print(coffees[1] + " 하나,");
        coffees[2] = "에스프레소";
        System.out.print(coffees[2] + " 하나,");
        System.out.print(coffees[3] + " 하나 ");
        System.out.println("주세요");

        int[] i = {1,2,3,4};
        System.out.println(i[0]);

    }
}
