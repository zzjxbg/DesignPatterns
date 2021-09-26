package org.example.patterns.facade;

/**
 * 外观角色
 */
public class SmartAppliancesFacade {

    //聚合各子系统角色
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    //通过语音控制
    public void say(String message) {
        if (message.contains("打开")) {
            on();
        } else if (message.contains("关闭")) {
            off();
        } else {
            System.out.println("听不懂!");
        }
    }

    //一键开电器
    private void on() {
        light.on();
        tv.on();
        airCondition.on();
    }

    //一键关电器
    private void off() {
        light.off();
        tv.off();
        airCondition.off();
    }
}
