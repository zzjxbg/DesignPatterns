package org.example.patterns.factory.abstract_factory;

/**
 * 具体工厂类(同一产品族不同产品等级)
 */
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
