package org.example.patterns.facade;

/**
 * 子系统角色
 */
public class TV {
    public void on() {
        System.out.println("打开了电视....");
    }

    public void off() {
        System.out.println("关闭了电视....");
    }
}
