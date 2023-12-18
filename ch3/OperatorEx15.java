package ch3;

public class OperatorEx15 {
    public static void main(String[] args) {
        char lowerCase = 'a';
        char upperCase = (char)(lowerCase-32); //'a'의 아스키코드 번호 97에서 32 뺀 65번이 문자 'A'
        System.out.println(upperCase);
    }
}
