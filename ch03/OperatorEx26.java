package ch03;

public class OperatorEx26 {
    public static void main(String[] args) {
        int a =5;
        int b=0;
        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a !=0 || ++b!=0 = %b%n", a!=0 || ++b!=0); // 좌측이 true 이기 때문에 어차피 true, OR 연산을 좌측만 평가함
        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0); // 좌측이 false이기 때문에 어차피 false, AND 연산을 좌측만 평가함
        System.out.printf("a=%d, b=%d%n", a,b);
    }
}
