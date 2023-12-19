package ch04;

public class FlowEx33 {
    public static void main(String[] args) {
        //for 문에 Loop1이라는 이름을 붙였다.
        Loop1 : for(int i=2; i<=9;i++){
            for(int j=1;j<=9; j++){
                if(j==5)
                    break Loop1; //break문에 반복문 이름을 지정해주면 하나 이상의 반복문도 벗어날 수 있다.(원래는 자신이 속한 하나의 반복문만 벗어날 수 있음)
//                break;
//                continue Loop1;
//                continue;
                System.out.println(i+"*"+j+"="+ i*j);
            }
                //end for i
                System.out.println();
        }
    }
}
