package Lesson6.HomeWork.Product;

public class Product {
    String name;
    double regularPrice;
    double discount;

    public Product() {
        this.name = "Cola";
    }

    public double ProductActualPrice (double regularPrice, double discount) {
        this.regularPrice = regularPrice-regularPrice*discount/100;
        return this.regularPrice;




    }


}
