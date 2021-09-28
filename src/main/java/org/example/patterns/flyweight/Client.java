package org.example.patterns.flyweight;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Client {
    public static void main(String[] args) {
        //获取I图形对象
        AbstractBox box1 = BoxFactory.getInstance().getShape("I");
        box1.display("灰色");

        //获取I图形对象
        AbstractBox box2 = BoxFactory.getInstance().getShape("L");
        box2.display("绿色");

        //获取I图形对象
        AbstractBox box3 = BoxFactory.getInstance().getShape("O");
        box3.display("红色");

        //获取I图形对象
        AbstractBox box4 = BoxFactory.getInstance().getShape("O");
        box4.display("黑色");

        System.out.println("两次获取到的O图形对象是否是同一对象:" + (box3 == box4));

    }
}
