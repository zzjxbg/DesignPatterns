package org.example.patterns.factory.abstract_factory;

/**
 * 具体工厂类(同一产品族不同产品等级)
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
