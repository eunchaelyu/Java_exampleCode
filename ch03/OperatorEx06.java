package ch03;

public class OperatorEx06 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b); //연산자 '+'는 두 개의 피연산자들의 자료형을 int형으로 변환한 다음 덧셈을 수행한다.
        System.out.println(c);
    }
}
