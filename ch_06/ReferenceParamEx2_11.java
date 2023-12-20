package ch_06;

public class ReferenceParamEx2_11 {
    public static void main(String[] args) {
        int[] x={10}; //크기가 1인 배열
        System.out.println(x[0]);

        change(x);
        System.out.println("After change(x)");
        System.out.println(x[0]);
    }
    static void change (int[] x){ //참조형 매개변수
        x[0]=1000;
        System.out.println(x[0]);
    }
}
