package org.example.patterns.builder.demo1;

/**
 * 指挥者类
 */
public class Director {

    //声明builder类型的对象
    private Builder builder;

    public Director(Builder builder) {this.builder = builder;}

    //组装自行车的功能
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
