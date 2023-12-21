package TEST;
public class Book {
    //인스턴스 변수
//    (1. 인스턴스 변수 -> 숫자형 pages, 문자형 title, 문자형 author)
    Integer pages;  //기본형 int 의 참조형 변수
    String title;
    String author;

    // 2. 클래스변수 숫자형 index
    static Integer index;

    // 3. title, author를 초기화하는 생성자
    Book(String title, String author){
        this.title = title;
        this.author= author;
    }

    //4. title의 값을 변경하는 setTitle 메서드
    public void setTitle(String title){
        this.title=title;
    }
    //5. title의 값을 조회하는 getTitle 메서드
    public String getTitle() {
        return title;
    }
    public static void main(String[] args) {
        Book s= new Book("제목","저자"); //Book 생성자 선언과 동시에 제목과 저자로 값을 초기화한다
        System.out.println(s.getTitle());

        s.setTitle("제목제목");
        System.out.println(s.getTitle());
    }
}

//참조형 변수
//: 1. 문자열 변수(String) 2. Object, Array, List 3. 래퍼 클래스 변수(Byte, Short, Integer, Long, Float, Double, Character, Boolean)
//: 참조형 클래스 -> 저장 위치가 힙메모리, 주소값 위치 스택메모리에 저장됨.
//
//클래스 변수
//: 클래스를 설계할 때, 멤버변수 중 모든 인스턴스에 공통으로 사용되는 것에 static을 붙인다
//: static 변수
//: 인스턴스를 생성하지 않아도 사용할 수 있다.(클래스가 메모리에 올라갈 때 이미 자동적으로 생성되기 때문)
//: 인스턴스 변수를 필요로 하지 않는다면 static을 붙인다(메서드 호출시간이 짧아져 성능이 향상된다)
//
//생성자
//: 인스턴스가 생성될 때 호출되는 인스턴스 초기화 메서드이다.
//: 생성자의 이름은 클래스의 이름과 같아야 한다.
//: 생성자는 리턴값이 없다
//
//this
//: 생성자의 이름으로 클래스 이름 대신 this를 사용한다.
//: 참조변수로 인스턴스 자신을 가리킨다.
//: this를 사용할 수 있는 것은 인스턴스 멤버 뿐이다.
//
//메서드
//: 메서드를 생성할 때 void를 쓴다는 것은 반환값이 없다는 것이다
//: 반환 값이 있다면 입력 타입과 값, return 을 적어줘야 한다

