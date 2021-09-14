package org.example.patterns.factory.factory_method;

/**
 * 具体工厂角色,专门用来生产美式咖啡
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
