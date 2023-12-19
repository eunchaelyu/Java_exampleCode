package ch04;

public class FlowEx29 { //숫자 중에 3,6,9 가 포함 돼있으면 포함된 개수만큼 박수를 침
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            System.out.printf("i=%d ", i);

            int tmp = i;

            do{
                //tmp%10이 3의 배수인지 확인(0 제외)
                if(tmp%10%3==0 && tmp%10!=0)
                    System.out.print("짝");
                //tmp/=10은 tmp = tmp/10과 동일
            }while((tmp/=10)!=0); //true 인동안 do문이 계속 돌아감

            System.out.println();
        }
    }
}
