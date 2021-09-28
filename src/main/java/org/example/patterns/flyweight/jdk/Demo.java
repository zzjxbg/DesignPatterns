package org.example.patterns.flyweight.jdk;

/**
 * 'Integer'默认先创建并缓存'-128 ~ 127'之间数的'Integer`对象,当调用valueOf时如果参数在'-128 ~ 127'
 *  之间则计算下标并从缓存中返回,否则创建一个新的'Integer'对象
 */
public class Demo {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;

        System.out.println("i1和i2对象是否是同一个对象？" + (i1 == i2));

        Integer i3 = 128;
        Integer i4 = 128;

        System.out.println("i3和i4对象是否是同一个对象？" + (i3 == i4));
    }
}
