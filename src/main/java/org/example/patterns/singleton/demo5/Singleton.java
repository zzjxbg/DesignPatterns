package org.example.patterns.singleton.demo5;

/**
 * 静态内部类方式
 * 原理：JVM加载外部类过程中不会加载静态内部类,只有内部类的属性/方法被调用时才会被加载,并初始化其静态属性
 * 被static修饰的成员变量INSTANCE，在多线程的情况下能保证只实例化一次(通过static修饰的成员变量初始化只会初始化一次)
 */
public class Singleton {

    private Singleton() {}

    private static class SingletonHolder {
        // 在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供公共访问方式
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
