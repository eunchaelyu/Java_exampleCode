package ch_07;

public class SuperTest1_05 {
    public static void main(String[] args) {
        Child c = new Child(); // Child라는 클래스타입의 객체를 new 연산자를 통해 생성, 객체의 주소값이 c에 저장됨.
        c.method(); //참조변수 c의 method()함수가 호출됨
    }
}
class Parent{
    int x = 10;
}
class Child extends Parent {
    void method(){
        System.out.println("x="+x);
        System.out.println("this.x=" + this.x); //자손 클래스에 선언된 멤버 변수를 뜻함
        System.out.println("super.x=" + super.x);  // 상속받은 멤버와 자신의 멤버와 이름이 같을 때 구별해야 하는 경우
                                                   // 조상 클래스로부터 상속받은 멤버변수 x를 뜻함
    }
}
