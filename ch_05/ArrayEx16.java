package ch_05;

public class ArrayEx16 {
    public static void main(String[] args) {
//        if(args!=null) { // Jvm이 입력된 매개변수가 없을 때 null 대신 크기가 0인 배열을 생성해서 args 에 전달하도록 구현되어 생략가능
            System.out.println("매개변수의 개수:" + args.length);
            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "]=\"" + args[i] + "\"");
//            }
        }
    }
}
