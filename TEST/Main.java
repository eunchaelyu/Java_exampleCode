package TEST;

//3번문제
//public class Main {
//    public String solution(String s) {
//        String answer = "";
//        String[] arr = s.split(" ");
//        String[] str = new String[2];
//        str[0]="10000";
//        str[1]="1";
//        int count =0;
//        for(int i=0; i<arr.length; i++) {
//            for(int j=2; j<Integer.parseInt(arr[i]); j++) {
//                if (Integer.parseInt(arr[i]) % j == 0) {
//                    count = 1;
//                    break;
//                }else{
//                    count = 0;
//                }
//            }
//                if (count==1 && Integer.parseInt(str[0]) > Integer.parseInt(arr[i])){ //소수가 아닌 수의 최소값
//                     str[0] = arr[i];}
//                else if (count ==0 && Integer.parseInt(str[1]) < Integer.parseInt(arr[i])){ //소수인 값 중 최대값
//                     str[1] = arr[i];}
//        }
//        answer=String.join(" ",str);
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main method = new Main();
//        String s = "15 3 10 9 7 8";
//        System.out.println(method.solution(s));
//    }
//}














//2번 문제
//public class Main {
//    public int solution(int[] arr1, int[] arr2) {
//        int answer = 0;
//        for(int i=0; i<arr1.length; i++){
//            answer += arr2[i]-arr1[i];
//            if(arr2[i]>=29)
//                answer -= (arr2[i]-21);
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main method = new Main();
//        int[] arr1 = {9, 9, 9, 9, 7, 9, 8};
//        int[] arr2 = {23, 23, 30, 28, 30, 23, 23};
//        System.out.println(method.solution(arr1, arr2));
//    }
//}












//1번 문제
//public class Main {
//    public int solution(int num) {
//        int answer = 0;
//        int money=1000-num; //잔돈
//        while(money!=0) {
//            if (money / 500 >=1) {
//                answer++;
//                money-=500;
//            }else if (money/100>=1){
//                answer += (money/100);
//                money-= (money/100*100);
//            }else if (money/50>=1){
//                answer+= (money/50);
//                money-= 50;
//            }else if (money/10>=1){
//                answer+= (money/10);
//                money-= (money/10*10);
//            }
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main method = new Main();
//        int num1 = 320;
//        System.out.println(method.solution(num1));
//    }
//}
