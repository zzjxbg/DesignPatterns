package org.example.patterns.facade;

/**
 * 子系统角色
 */
public class Light {

    public void on() {
        System.out.println("打开了灯....");
    }

    public void off() {
        System.out.println("关闭了灯....");
    }
}
