package ch_07;
class Tv {
    boolean power;
    int channel;

    void power() {power =!power;}
    void channelUp() {++channel;}
    void channelDown(){--channel;}
}
class CaptionTv extends Tv{
    boolean caption;
    void displayCaption (String text){
        if(caption){
            System.out.println(text);
        }
    }
}
public class CaptionTvTest_01 {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel =10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello,World");
        ctv.caption = true;
        ctv.displayCaption("Hello, World"); //caption이 true인 경우에만 출력
    }
}
