package Chap_06;

public class _03_Return {
    //호텔 전화번호
    public static String getPhonenumber(){
        String phonenumber = "02-1234-5678";
        return  phonenumber;
    }
    //호텔 주소
    public static String getAddress(){
        String address = "서울시 중구가 시키드나";
        return address;
    }
    //호텔 액티비티
    public static String getActivities(){
        String Activities = "볼링장, 탁구장, 노래방";
        return Activities;
    }

    public static void main(String[] args) {
         String contactNumber = getPhonenumber();
         String address = getAddress();
         String Activities = getActivities();
        System.out.println("호텔 전화번호 : " +contactNumber );
        System.out.println("호텔 주소 : " + address );
        System.out.println("호텔 전화번호 : " + Activities );
    }
}
