package Lesson6.HomeWork.Product;

public class ProductDemo {

    public static void main(String[] args) {
        Product product=new Product();
        System.out.println(product.name);
        product.ProductActualPrice(100, 20);
        System.out.println(product.regularPrice);
    }
}
