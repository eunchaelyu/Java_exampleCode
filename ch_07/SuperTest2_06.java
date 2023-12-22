package ch_07;

public class SuperTest2_06 {
    public static void main(String[] args) {
        Child6 c = new Child6();
        c.method();
    }
}
class Parent6 {
    int x=10;
}
class Child6 extends Parent6 {
    int x = 20;

    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x); //자손 클래스에 선언된 멤버 변수를 뜻함
        System.out.println("super.x=" + super.x); // 조상 클래스로부터 상속받은 멤버변수 x를 뜻함
    }
}
