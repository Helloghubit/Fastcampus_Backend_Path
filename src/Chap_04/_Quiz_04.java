package Chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int cost = 4000;
        int hour = 5;
        boolean handicapped = false;
        boolean smallCar = false;
        if (cost * hour < 30000) {
            if (handicapped || smallCar)
                System.out.println("주차 요금은 " + cost * hour / 2 + "원입니다");
            else System.out.println("주차 요금은 " + cost * hour + "원입니다.");
        } else {
            if (handicapped || smallCar)
                System.out.println("주차 요금은 15000원입니다.");
            else System.out.println("주차 요금은 30000원입니다.");
        }

        smallCar = true;
        if (cost * hour < 30000) {
            if (handicapped || smallCar)
                System.out.println("주차 요금은 " + cost * hour / 2 + "원입니다");
            else System.out.println("주차 요금은 " + cost * hour + "원입니다.");
        } else {
            if (handicapped || smallCar)
                System.out.println("주차 요금은 15000원입니다.");
            else System.out.println("주차 요금은 30000원입니다.");
        }

        hour = 10;
        smallCar = false;
        handicapped = true;
        if (cost * hour < 30000) {
            if (handicapped || smallCar)
                System.out.println("주차 요금은 " + cost * hour / 2 + "원입니다");
            else System.out.println("주차 요금은 " + cost * hour + "원입니다.");
        } else {
            if (handicapped || smallCar)
                System.out.println("주차 요금은 15000원입니다.");
            else System.out.println("주차 요금은 30000원입니다.");
        }
hour=5;
        handicapped=false;
        int fee = 4000 * hour;
        if (fee>30000)fee=30000;
        if (smallCar||handicapped)
            fee/=2;
        System.out.println("주차 요금은 "+fee+"원입니다.");
    }
}