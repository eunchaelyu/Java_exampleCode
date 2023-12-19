package ch_05;

public class ArrayEx10 { //버블 정렬
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i=0; i<numArr.length; i++){
        System.out.print(numArr[i]= (int)(Math.random()*10)); //0~9 중 임의의 수
        }
        System.out.println();

        for(int i=0; i<numArr.length-1; i++){ //비교작업은 배열의 길이-1 번 만큼 반복해서 비교
            boolean changed = false; //자리바꿈이 발생했는지를 체크, 매 반복마다 false로 초기화

            for(int j=0; j<numArr.length-1-i; j++){ //매 반복마다 비교해야하는 범위는 하나씩 줄어들기 때문에 numArr.length-1-i번을 비교한다
                if (numArr[j]>numArr[j+1]){  //옆에 값이 작으면 서로 바꾼다
                    int temp = numArr[j];
                    numArr[j] =numArr[j+1];
                    numArr[j+1]=temp;
                    changed=true;
                }
            }
            if(!changed) break; //자리바꿈이 없으면 반복문을 벗어난다

            for(int k=0; k<numArr.length; k++)
                System.out.print(numArr[k]);
            System.out.println();
        }

        }

}
