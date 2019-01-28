package com.yun27jin.generic.third;

public class ProductExample {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();
        product1.setType(new Tv());
        product1.setModel("스마트 Tv");
        Tv tv = product1.getType();
        String product1Model = product1.getModel();

        Product<Car, String> product2 = new Product<>();
        product2.setType(new Car());
        product2.setModel("디젤");
        Car car = product2.getType();
        String product2Model = product2.getModel();
    }
}
