package ch_07;

class Shape{ //Shape(도형) 클래스 정의
    String color = "black";
    void draw(){
        System.out.printf("[color=%s]%n",color); //입출력값 없이 출력만 한다
    }
}
class Point2 { //점 클래스 정의
    int x;
    int y;

    Point2 (int x,int y){
        this.x =x;
        this.y=y;
    }
    Point2(){
        this(0,0);
    }
    String getXY(){
        return"("+x+","+y+")"; //x좌표와 y좌표 리턴
    }
}
class Circle extends Shape{ //상속관계
    Point2 center; //포함관계  // =new Point2(); 참조변수의 초기화를 여기서 해주지 않으면 생성자에서 해줘야한다.
    int r;

    Circle(){ //Circle(Point center,int r)를 호출, 참조변수의 초기화
        this(new Point2(0,0), 100);
    }
    Circle(Point2 center, int r){
        this.center = center;
        this.r =r;
    }
    void draw(){
        System.out.printf("[center=(%d,%d), r=%d, color=%s]%n", center.x, center.y, r, color);
    }
}
class Triangle extends Shape{
    Point2[] p = new Point2[3];  //포함

    Triangle(Point2[] p){
        this.p=p;
    }

    void draw() {
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(),p[1].getXY(),p[2].getXY(), color);
    }
}
public class DrawShape_02 {
    public static void main(String[] args) {

        Point2[] p = {new Point2(100, 100),
                new Point2(140, 50),
                new Point2(200, 100)
        };
        Point2 p2 = new Point2();

        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point2(150, 150), 50);

        t.draw();
        c.draw();
    }
}
