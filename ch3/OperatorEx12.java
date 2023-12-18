package ch3;

public class OperatorEx12 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = c1;
        char c3 = ' ';

        int i = c1 +1;

        c3= (char)(c1+1); //c1+1이 int이므로 char형 변수 c3에 담기 위해서 char으로 형변환 필요
        c2++;
        c2++;
        System.out.println("i=" +i);
        System.out.println("c2=" +c2);
        System.out.println("c3=" +c3);
    }
}
