package ch_05;

public class ArrayEx06 { //최대값과 최소값
    public static void main(String[] args) {
        int[] score ={79, 88, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0];
        //최대값 최소값 모두 배열의 첫번째 값으로 초기화한다

        for(int i=1; i< score.length; i++){ //배열의 두번째 요소부터 비교하기 위해서 i의 초기값을 1로 지정
            if(score[i]>max){
                max=score[i];
            }else if(score[i] <min){
                min = score[i];
            }
        }
        System.out.println("최대값: "+max);
        System.out.println("최소값: "+min);
    }
}
