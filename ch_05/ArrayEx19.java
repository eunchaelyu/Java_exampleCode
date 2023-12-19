package ch_05;

public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
                , {50, 50, 50}
        };
        int korTotal = 0, engTotal = 0, mathTotal = 0;
        System.out.println("번호  국어  영어  수학  총점  평균  ");
        System.out.println("=================================");

        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            float avg = 0.0f;

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];
            System.out.printf("%3d", i + 1); //번호 1~5 출력

            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j]; //총점 구하기
                System.out.printf("%5d", score[i][j]); // 점수 하나씩 인덱스 별로 저장하기
            }
            avg = sum / (float) score[i].length; //평균값 구하기
            System.out.printf("%5d %5.1f%n", sum, avg); //총점 평균값 출력하고 줄바꿈
        }
        System.out.println("===================================");
        System.out.printf("총점: %3d %4d %4d%n", korTotal, engTotal, mathTotal);
    }
}
