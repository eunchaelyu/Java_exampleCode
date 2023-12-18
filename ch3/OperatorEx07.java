package ch3;

public class OperatorEx07 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a + b); //연산자 '+'는 두 개의 피연산자들의 자료형을 int형으로 변환한 다음 덧셈을 수행하기 때문에 error
        System.out.println(c);
    }
}
