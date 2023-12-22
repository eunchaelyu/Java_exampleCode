package ch_07;

public class DeckTest_03 {
    public static void main(String[] args) {
        Deck d = new Deck(); //new 연산자를 통해 Deck라는 클래스 타입의 객체를 생성한다. 그 객체의 주소를 참조변수 d에 담는다.
        Card c= d.pick(0);
        System.out.println(c); // =System.out.println(c.toString())과 같다 , 자동적으로 호출됨(Object에 정의)

        d.shuffle(); //클래스타입 Deck의 객체 d의 shuffle함수를 호출
        c=d.pick(0); //클래스타입 Deck의 객체 d의 pick(int index)함수를 호출 , cardArr[0]에 저장된 Card 객체의 주소가 참조변수 c에 저장됨
        System.out.println(c);
    }
}
class Deck{
    final int CARD_NUM=52; // 카드의 개수  (final을 붙였다는 것은 상수라는 뜻)
    Card cardArr[] = new Card[CARD_NUM]; //카드의 갯수에 맞게 배열을 생성한다. (포함관계)

    Deck() {  // 생성자는 void가 생략된다.
        int i=0;
        for(int k=Card.KIND_MAX; k>0; k--)
            for(int n=0; n<Card.NUM_MAX; n++)
                cardArr[i++] = new Card(k,n+1);
    }
    Card pick(int index){ //0
        return cardArr[index];  //0x200
    }
    Card pick(){
        int index = (int)(Math.random()*CARD_NUM); //0~52개의 수 중 임의의 수
        return pick(index);
    }
    void shuffle(){
        for(int i=0; i<cardArr.length; i++){
            int r = (int)(Math.random()*CARD_NUM);

            Card temp = cardArr[i];
            cardArr[i]=cardArr[r];
            cardArr[r]=temp;
        }
    }
}
class Card{
    static final int KIND_MAX=4; //카드 무늬 수
    static final int NUM_MAX=13; //무늬별 카드 수

    static final int SPADE=4;
    static final int DIAMOND=3;
    static final int HEART =2;
    static final int CLOVER =1;
    int kind;
    int number;

    Card(){
        this(SPADE,1);
    }
    Card(int kind, int number){
        this.kind=kind;
        this.number=number;
    }
    public String toString(){
        String[] kinds={"","CLOVER","HEART","DIAMOND","SPADE"};
        String numbers= "0123456789XJQK";
        return "kind:" + kinds[this.kind] +",number : " + numbers.charAt(this.number);
    }
}
