package Chap_05;

public class _04_MultiArrayLooptest {
    public static void main(String[] args) {
        String Eng[] = {"A","B","C","D","E","F","G","H","I","J","K"};
        String[][] seats = new String [10][15] ;
        for (int i = 0; i< seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j]=Eng[i] + (j+1);
                System.out.print(seats[i][j]+" ");
            }
            System.out.println();
        }



    }
}
