package org.example.patterns.proxy.static_proxy;

/**
 * 真实主题类
 */
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
