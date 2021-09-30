package org.example.patterns.command;

import java.util.Map;
import java.util.Set;

/**
 * 具体命令类
 */
public class OrderCommand implements Command{

    // 持有接收者对象
    private SeniorChef receiver;
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order){
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单：");
        Map<String, Integer> footDic = order.getFoodDic();
        //遍历map集合
        Set<String> keys = footDic.keySet();
        for (String foodName : keys) {
            // 调用接收者的功能来完成命令要执行的操作
            receiver.makeFood(footDic.get(foodName),foodName);
        }
        System.out.println(order.getDiningTable() + "桌的饭弄好了");
    }
}
