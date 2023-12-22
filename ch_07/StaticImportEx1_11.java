package ch_07;
import static java.lang.System.out; //System.out.을 out만으로 참조가능
import static java.lang.Math.*; //Math.random()만 괄호 안 붙임
public class StaticImportEx1_11 {
    public static void main(String[] args) {
        out.println(random());

        out.println("Math.PI :" + PI);
    }
}
