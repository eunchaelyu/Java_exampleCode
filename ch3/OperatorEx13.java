package ch3;

public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';

//        char c2 = c1 + 1; //수식에 변수가 들어가있으면 컴파일러가 미리 계산을 할 수 없다 (char)(c1+1)로 적어줘야 함
        char c2 = 'a' + 1; //상수 또는 리터럴 간의 연산은 실행 과정동안 변하는 값이 아니라서 컴파일러가 미리 계산
        System.out.println(c2);
    }
}
