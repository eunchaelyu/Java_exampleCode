package ch_05;

public class ArrayEx03 {
    public static void main(String[] args) {
        int[] arr = new int[5]; //배열 길이 5인 arr 배열 선언 및 생성

        for(int i=0; i<arr.length; i++) //1부터 5까지의 값을 차례대로 저장
            arr[i] = i+1;

        System.out.println("[변경전]");
        System.out.println("arr.length:"+arr.length);
        for(int i=0; i< arr.length; i++)
            System.out.println("arr["+i+"]:"+arr[i]);

        int[] tmp = new int[arr.length*2]; //arr의 배열길이의 2배인 tmp 배열 선언 및 생성

        for(int i=0; i< arr.length; i++)
            tmp[i]=arr[i]; //배열 arr에 저장된 값들을 배열 tmp에 복사한다.

        arr=tmp; //tmp에 저장된 값을 arr에 저장한다.

        System.out.println("[변경후]");
        System.out.println("arr.length:"+arr.length);
        for(int i=0; i < arr.length;i++)
            System.out.println("arr["+i+"]:"+arr[i]);

    }
}
