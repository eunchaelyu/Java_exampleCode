package ch_06;

class Data9 {int x;}

public class PrimitiveParamEx_09 {
    public static void main(String[] args) {
        Data9 d = new Data9();
        d.x =10;
        System.out.println(d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println(d.x);
    }
    static void change (int x){ //기본형 매개변수
        x=1000;
        System.out.println(x);
    }
}
