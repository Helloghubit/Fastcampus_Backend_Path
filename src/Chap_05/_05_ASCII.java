package Chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        //아스키 코드
        char c = 'A'; //알파벳 A 65, 소문자 97 숫자 0 은 48부터 시작
        System.out.println(c);
        System.out.println((int)c);



//        c = 'B';
//        System.out.println(c);
//        System.out.println((int)c);
//
//        c++;
//        System.out.println(c);
//        System.out.println((int)c);



        String[][] seats = new String [10][15] ;
        for (int i = 0; i< seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j]=String.valueOf(c) + (j+1);
                System.out.print(seats[i][j]+" ");
            }
            c++;
            System.out.println();
        }
    }
}
