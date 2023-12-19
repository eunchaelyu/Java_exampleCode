package ch_05;


public class ArrayEx15 {
    public static void main(String[] args) {
        String source="SOSHELP";
        String[] morse = {".-", "-...","-.-","-..","."
                            ,"..-.","--.","....","..",".---"
                            ,"-.-",".-..","--","-.","---"
                            ,".--.","--.-",".-.","...","-"
                            ,"..-","...-",".--","-..-","-.--"
                            ,"--.."};
        String result="";
        for(int i=0; i< source.length(); i++){ //i가 0일 때 source.charAt(0)은 첫번째 문자 S //'S'-'A'=83-65=18
            result += morse[source.charAt(i)-'A'];  //result= result+"...";
        }
        System.out.println("source:"+source);
        System.out.println("morse:"+result);
    }
}
