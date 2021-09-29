package org.example.patterns.strategy;

public class Client {
    public static void main(String[] args) {
        //春节来了,使用春节促销活动
        SalesMan salesMan = new SalesMan(new StrategyA());
        //展示促销活动
        salesMan.salesManShow();

        System.out.println("===========");
        //中秋节来了,使用中秋节促销活动
        salesMan.setStrategy(new StrategyB());
        //展示促销活动
        salesMan.salesManShow();

        System.out.println("===========");
        //圣诞节来了,使用圣诞节促销活动
        salesMan.setStrategy(new StrategyC());
        //展示促销活动
        salesMan.salesManShow();
    }
}
