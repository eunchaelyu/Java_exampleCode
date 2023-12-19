package ch_03;

public class OperatorEx23 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
        System.out.printf("str1==\"abc\" ? %b%n", str1=="abc");
        System.out.printf("str2==\"abc\" ? %b%n", str2=="abc"); //똑같은 abc지만 객체가 달라서 false를 얻게 된다. 하지만 equals()는 객체가 달라도 내용이 같으면 true 출력한다.
        System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc")); //그래서 문자열을 비교할 때는 항상 equals()를 사용하자
        System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
        System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
        System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
    }
}
