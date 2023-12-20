package ch_06;
class Data10 {int x;}
public class ReferenceParamEx1_10 {
    public static void main(String[] args) {
        Data10 d = new Data10();
        d.x=10;
        System.out.println(d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println(d.x);
    }
    static void change (Data10 d){ //참조형 매개변수
        d.x =1000;
        System.out.println(d.x);
    }
}
