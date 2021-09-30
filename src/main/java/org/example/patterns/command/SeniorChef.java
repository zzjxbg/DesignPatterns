package org.example.patterns.command;

/**
 * 接收者角色
 */
public class SeniorChef {
    public void makeFood(int num,String foodName) {
        System.out.println(num + "份" + foodName);
    }
}
