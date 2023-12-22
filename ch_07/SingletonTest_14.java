package ch_07;

public class SingletonTest_14 {
    public static void main(String[] args) {
//        Singleton s = new Singleton();    생성자에 접근제어자 private을 사용했기 때문에 인스턴스의 생성을 제한된다.
        Singleton s = Singleton.getInstance();
    }
}

final class Singleton {
    private static Singleton s = new Singleton(); //getInstance()에서 사용될 수 있도록 인스턴스가 미리 생성되어야 하므로 static이어야 한다.

    private Singleton() {
        //...
    }

    public static Singleton getInstance() { //인스턴스를 생성해서 반환해주는 public 메서드를 제공함으로써 외부에서 이 클래스의 인스턴스를 사용할 수 있도록 할 수 있다. public 인 동시에 static이여야 한다.
        if (s == null)
            s = new Singleton(); //클래스 내부에서는 getInstance()을 이용해 인스턴스를 생성할 수 있다.
        return s;
    }
}
