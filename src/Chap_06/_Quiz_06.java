package Chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String id,int a){
       String hiddenLetter = "*";
        if (id.length()==3) {
            hiddenLetter = "**";
        } else if (id.length()==14) {
            hiddenLetter = "******";
        } else if  (id.length()==13)
            hiddenLetter = "****";
        return id.substring(0,a) + hiddenLetter;}
    //fori i<data.length()-index
    //hiddenData+="*";



    public static void main(String[] args) {
        String name= "나코딩";
        String idNo = "990130-1234567";
        String phone= "010-1234-5678";
        System.out.println("이름 : "+ getHiddenData(name,1));
        System.out.println("주민등록번호 : "+ getHiddenData(idNo,8));
        System.out.println("전화번호 : " + getHiddenData(phone,9));
        }
}
