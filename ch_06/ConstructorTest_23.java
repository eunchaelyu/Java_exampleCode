package ch_06;
class Data1{
    int value;
}
class Data2{
    int value;
    Data2(int x){ //매개변수가 있는 생성자
        value=x;
    }
}
public class ConstructorTest_23 {
    public static void main(String[] args) {
        Data1 d1 = new Data1(); //정의 되어있는 생성자가 없으므로 기본 생성자를 추가해줌
//        Data2 d2 = new Data2(); // 매개변수가 있는 생성자가 이미 정의 되어 있으므로 기본 생성자가 추가 되지 않았다.
    }
}
