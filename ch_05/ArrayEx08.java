package ch_05;

public class ArrayEx08 { //임의의 값으로 배열 채우기
    public static void main(String[] args) {
        int[] ball = new int[45];

        for (int i=0; i<ball.length; i++)
            ball[i] =i+1;
        int temp =0;
        int j=0;

        for(int i=0; i< 6; i++){ //6번 반복
            j = (int)(Math.random()*45); //0~44중 임의의 값을 얻는다
            temp = ball[i];
            ball[i]=ball[j];
            ball[j]=temp;
        } //즉, ball[i] <-> ball[j]

        for (int i=0; i<6; i++)
            System.out.printf("ball[%d]=%d%n",i,ball[i]);
    }
}
