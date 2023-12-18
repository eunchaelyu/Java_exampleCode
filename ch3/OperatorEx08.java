package ch3;

public class OperatorEx08 {
    public static void main(String[] args) {
        int a = 1_000_000; //1백만
        int b = 2_000_000; //2백만
        long c = a * b; //2,000,000,000,000 ?
        System.out.println(c); //int 타입간의 연산결과는 int이기 때문에 -1454759936이라는 값이 나온다
    }
}
