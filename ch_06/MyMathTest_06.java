package ch_06;

public class MyMathTest_06 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1=mm.add(5L,3L);
        long result2=mm.subtract(5L,3L);
        long result3=mm.multiply(5L,3L);
        double result4=mm.divide(5L,3L);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
class MyMath{
    long add(long a, long b){return a+b;}
    long subtract(long a, long b){return a-b;}
    long multiply(long a, long b){return a*b;}
    double divide(double a, double b){return a/b;} //long형의 값을 double형 변수에 저장하는 것과 같아서 자동 형변환이 되어 저장된다
        }
