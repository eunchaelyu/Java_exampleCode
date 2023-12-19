import java.util.*;

public class ArrayEx21 { //빙고
    public static void main(String[] args) {
        final int SIZE = 5;
        int x = 0, y = 0, num = 0;

        int[][] bingo = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);

        //배열의 모든 요소를 1부터 SIZE*SIZE까지의 숫자로 초기화
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                bingo[i][j] = i * SIZE + j + 1;

        //배열에 저장된 값을 뒤섞는다.(shuffle)
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                x = (int) (Math.random() * SIZE);
                y = (int) (Math.random() * SIZE);

                //bingo[i][j]와 임의로 선택된 값 bingo [x][y]을 바꾼다
                int tmp = bingo[i][j];
                bingo[i][j] = bingo[x][y];
                bingo[x][y] = tmp;
            }
        }
        do { //num !=0 인 경우 계속 돌아감
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++)
                    System.out.printf("%2d ", bingo[i][j]); //shuffle 한 빙고판을 다시 출력
                System.out.println();
            }
            System.out.println();

            System.out.printf("1~%d의 숫자를 입력하세요.(종료:0)>", SIZE * SIZE);
            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            //입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0을 저장
            outer: //이름 붙은 반복문
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (bingo[i][j] == num) { // 입력한 num 값과 빙고판에 있는 요소가 일치하면 0으로 저장한다
                        bingo[i][j] = 0;
                        break outer; //outer 반복문만 빠져나감
                    }
                }
            }
        }while(num!=0);
    }
}