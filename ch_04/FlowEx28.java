package ch_04;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input =0, answer=0;

        answer= (int)(Math.random()*100)+1;
        Scanner scanner = new Scanner(System.in);

        do{
            //조건식의 연산결과가 참일 때 수행될 문장들을 적는다
            System.out.print("1과 1000사이의 정수를 입력하세요.>");
            input = scanner.nextInt();

            if(input>answer){
                System.out.println("더 작은 수로 다시 시도해보세요.");
            }else if(input<answer){
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }
        }while (input != answer); //조건식의 연산결과가 false일 때 출력하고 빠져나간다.
        System.out.println("정답입니다.");
    }
}
