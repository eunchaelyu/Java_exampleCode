package ch03;

public class OperatorEx21 {
    public static void main(String[] args) {
        System.out.printf("10==10.0f  \t %b%n", 10 ==10.0f); //int 와 float 비교 이기 때문에 10을 float로 변환 후 비교
        System.out.printf("'0'==0 \t %b%n", '0'==0);
        System.out.printf("'A'==65 \t %b%n", 'A'==65);
        System.out.printf("'A'>'B' \t %b%n", 'A' >'B');
        System.out.printf("'A'+1 != 'B' \t %b%n", 'A'+1 != 'B');
    }
}
