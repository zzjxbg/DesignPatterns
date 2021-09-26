package org.example.patterns.decorator;

/**
 * 具体装饰者类
 */
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood) {
        super(2,"培根",fastFood);
    }

    public float cost() {
        //计算价格
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
