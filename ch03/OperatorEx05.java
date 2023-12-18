package ch03;

public class OperatorEx05 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        System.out.printf("%d + %d = %d%n", a, b, a+b); //%d로 표현하는 것은 정수로 나타내겠다는 뜻
        System.out.printf("%d - %d = %d%n", a, b, a-b);
        System.out.printf("%d * %d = %d%n", a, b, a*b);
        System.out.printf("%d / %d = %d%n", a, b, a/b);
        System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b); //%f는 실수로 표현하겠다는 뜻
    }
}
