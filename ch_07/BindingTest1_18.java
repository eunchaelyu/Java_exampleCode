package ch_07;

public class BindingTest1_18 {
    public static void main(String[] args) {
        Parent18 p = new Child18();
        Child18 c = new Child18();
        System.out.println("p.x="+p.x);
        p.method();
        System.out.println("c.x="+c.x);
        c.method();
    }
}
class Parent18 {
    int x= 100;
    void method(){
        System.out.println("Parent Method");
    }
}
class Child18 extends Parent18 {
    int x = 200;

    void method(){
        System.out.println("Child Method");
    }
}
