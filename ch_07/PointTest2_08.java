package ch_07;

public class PointTest2_08 {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(); //Point3D클래스타입의 객체 인스턴스를 생성하면
        System.out.println("p3.x=" + p3.x);
        System.out.println("p3.y=" + p3.y);
        System.out.println("p3.z=" + p3.z);
    }
}
class Point8 {
    int x=10;
    int y=20;
    Point8 (int x, int y){
        this.x=x;
        this.y=y;
    }
}
class Point3D extends Point8 {
    int z=30;

    Point3D(){
        this(100,200,300);
    }
    Point3D (int x, int y, int z){
        super(x,y);
        this.z=z;
    }
}

//Point3D클래스타입의 객체 인스턴스를 생성하면
// 아래와 같은 순서로 생성자가 호출된다
// Point3D -> Point3D(int x, int y, int z) -> Point (int x, int y) -> Object()
