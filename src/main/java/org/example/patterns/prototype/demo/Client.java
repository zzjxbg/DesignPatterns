package org.example.patterns.prototype.demo;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建一个原型类对象
        Realizetype realizetype = new Realizetype();
        //调用Realizetype类中的clone方法进行对象的克隆
        Realizetype clone = realizetype.clone();
        //原型对象和克隆对象是否是同一个对象
        System.out.println(realizetype == clone);
    }
}
