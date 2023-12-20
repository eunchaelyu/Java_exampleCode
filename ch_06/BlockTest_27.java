package ch_06;

public class BlockTest_27 {
    static {
        System.out.println("static{ }"); //클래스 초기화 블럭
    }
    {
        System.out.println("{ }"); //인스턴스 초기화 블럭
    }
    public  BlockTest_27() {
        System.out.println("생성자"); //생성자
    }
    public static void main(String[] args) {
        System.out.println("BlockTest_27 bt = new BlockTest();");
        BlockTest_27 bt = new BlockTest_27();

        System.out.println("BlockTest_27 bt2 = new BlockTest();");
        BlockTest_27 bt2 = new BlockTest_27();
    }
}
//클래스 초기화 블럭(처음 메모리에 로딩 될 때 한번만 수행)-> main 메서드 -> 인스턴스 생성 -> 인스턴스 초기화 블럭 -> 생성자