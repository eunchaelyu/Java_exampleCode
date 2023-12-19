package ch_05;

public class ArrayEx04 {
    public static void main(String[] args) {
        char[] abc= {'A','B','C','D'};
        char[] num={'0','1','2','3','4','5','6','7','8','9'};
        System.out.println(abc); //ABCD
        System.out.println(num); //0123456789
        //다른 배열과 달리 char 배열은 for문을 사용하지 않고도 print()나 println()으로 배열에 저장된 모든 문자를 출력할 수 있다.

        //배열의 abc와 num을 붙여서 하나의 배열(result)로 만든다.
        char[]result = new char[abc.length+num.length];
        System.arraycopy(abc, 0, result,0, abc.length); //ABCD0000000000
        System.arraycopy(num, 0, result,abc.length, num.length); //ABCD0123456789
        System.out.println(result); //ABCD0123456789

        //배열 abc을 배열 num의 첫번째 위치부터 배열 abc의 길이만큼 복사
        System.arraycopy(abc,0,num,0,abc.length);
        System.out.println(num); //ABCD456789

        //number의 인덱스 6 위치에 3개를 복사
        System.arraycopy(abc, 0, num, 6,3);
        System.out.println(num); //ABCD45ABC9
    }
}
