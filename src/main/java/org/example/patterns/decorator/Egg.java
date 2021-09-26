package org.example.patterns.decorator;

/**
 * 具体装饰者类
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(1,"鸡蛋",fastFood);
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
