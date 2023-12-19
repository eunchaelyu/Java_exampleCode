package ch_05;

public class ArrayEx07 { //섞기(shuffle)
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i=0; i<numArr.length; i++){
            numArr[i] =i;
            System.out.print(numArr[i]);
        }
        System.out.println();

        for(int i=0; i< 100; i++){ //100번 반복
            int n = (int)(Math.random()*10); //0~9중 임의의 값을 얻는다
            int tmp = numArr[0]; //빈공간 변수 tmp 에 0 인덱스 값을 담는다
            numArr[0]=numArr[n]; //numArr 0 인덱스 공간에 n 인덱스 값을 담는다
            numArr[n]=tmp; // numArr n 인덱스 공간ㅇ tmp 를 담는다
        } //즉, numArr[0] <-> numArr[n]

        for (int i=0; i<numArr.length; i++)
            System.out.print(numArr[i]);
    }
}
