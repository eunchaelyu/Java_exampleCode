package ch_06;

class Product{
    static int count = 0;
    int seriaNo;

    {
        ++count;
        seriaNo = count; //Product 인스턴스가 생성될 때마다 count의 값을 1씩 증가시켜서 seriaNo에 저장한다
    }

    public Product() {}
}
public class ProductTest_29 {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println(p1.seriaNo);
        System.out.println(p2.seriaNo);
        System.out.println(p3.seriaNo);
        System.out.println(Product.count);
    }
}
