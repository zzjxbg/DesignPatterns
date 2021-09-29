package org.example.patterns.strategy;

/**
 * 环境类
 */
public class SalesMan {

    //持有抽象策略角色的引用
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    // 由促销员展示促销活动给用户
    public void salesManShow() {
        strategy.show();
    }
}
