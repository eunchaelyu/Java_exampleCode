package ch_06;
class Car{
    String color;
    String gearType;
    int door;

    Car(){
        this("white ","auto ",4);
    }
    Car (String color){
        this(color,"auto ",4);
    }
    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType=gearType;
        this.door=door;
    }
}
public class CarTest2_25 {
    public static void main(String[] args) {
        Car c1 = new Car(); // 생성자 Car()를 이용해 인스턴스를 생성한 경우 인스턴스 변수가 각각 white, auto, 4로 초기화 되었다
        Car c2 = new Car("blue ");

        System.out.println(c1.color + c1.gearType + c1.door);
        System.out.println(c2.color + c2.gearType + c2.door);
    }
}
