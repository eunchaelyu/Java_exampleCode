package ch03;

public class OperatorEx09 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000;
        long b = 1_000_000 * 1_000_000L;

        System.out.println("a="+a); // a = -727379968 int 타입간의 연산결과는 int 타입인데 2X10^9를 넘으므로 오버플로우가 발생함
        System.out.println("b="+b); // b = 1000000000000 int 와 long 타입의 연산결과는 long 이기 떄문에 올바른 결과가 나옴
    }
}
