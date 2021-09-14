package org.example.patterns.factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
        //创建的是Italy风味甜品工厂对象
        ItalyDessertFactory factory = new ItalyDessertFactory();
        //获取Latte咖啡和Tiramisu甜品
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}
