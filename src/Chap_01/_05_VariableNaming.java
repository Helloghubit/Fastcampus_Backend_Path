package Chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자 사용 가능, 공백 X
        // 3. 밑줄 또는 문자로 시작 가능
//        4. 한 단어 또는 2개 이상 단어의 연속
//        5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫단어는 제외)
        // 6. 예약어 사용불가

        //입국 신고서 (여행)
        String  nationality = "대한민국"; // 국적
        String  firstName = "택민";
        String  lastName = "권";
        String  dateOfBirth = "1998-07-07";
        String  residentialAddress = "힐튼 호텔";
        String  purposeOfVisit = "여행";
        String  flightNo = "KE657";
        String  _flightNo = "KE657";
        String  flight_No = "KE657";

        int accompany = 2;
        int lengthOfStay = 5;

        String item1 = "시계";
        String item2 = "가방";
        String item3 = "노트북";
        System.out.println(flightNo);


    }
}
