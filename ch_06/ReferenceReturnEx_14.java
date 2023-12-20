package ch_06;
class Data14 { int x;}
public class ReferenceReturnEx_14 { //참조형 반환타입
    public static void main(String[] args) {
        Data14 d = new Data14() ;
        d.x =10;

        Data14 d2 = copy(d); //copy 메서드는 새로운객체 생성 후 매개변수로 넘겨받은 객체에 저장된 값을 복사해서 반환

        System.out.println(d.x);
        System.out.println(d2.x);
    }
    static  Data14 copy (Data14 d){
        Data14 tmp = new Data14() ; //새로운 객체 생성
        tmp.x=d.x; //d.x의 값을 tmp.x에 복사
        return tmp; //복사한 객체의 주소를 반환
    }
}
