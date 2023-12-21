package ch_07;

class Shape{ //Shape(도형) 클래스 정의
    String color = "black";
    void draw(){
        System.out.printf("[color=%s]%n",color); //입출력값 없이 출력만 한다
    }
}
class Point { //점 클래스 정의
    int x;
    int y;

    Point (int x,int y){
        this.x =x;
        this.y=y;
    }
    Point(){
        this(0,0);
    }
    String getXY(){
        return"("+x+","+y+")"; //x좌표와 y좌표 리턴
    }
}
class Circle extends Shape{ //상속관계
    Point center; //포함관계
    int r;

    Circle(){
        this(new Point(0,0),100); //Circle(Point center,int r)를 호출
    }
    Circle(Point center, int r){
        this.center = center;
        this.r =r;
    }
    void draw(){
        System.out.printf("[center=(%d,%d), r=%d, color=%s]%n", center.x, center.y, r, color);
    }
}
class Triangle extends Shape{
    Point[] p = new Point[3];  //포함

    Triangle(Point[] p){
        this.p=p;
    }

    void draw() {
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(),p[1].getXY(),p[2].getXY(), color);
    }
}
public class DrawShape_02 {
    public static void main(String[] args) {

        Point[] p = {new Point(100, 100),
                new Point(140, 50),
                new Point(200, 100)
        };
        Point p2 = new Point();

        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(150, 150), 50);

        t.draw();
        c.draw();
    }
}
