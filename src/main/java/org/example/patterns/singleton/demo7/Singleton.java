package org.example.patterns.singleton.demo7;

import java.io.Serializable;

public class Singleton implements Serializable {

    private Singleton() {}

    private static class SingletonHolder {
        // 在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供公共访问方式
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //当进行反序列化时,会自动调用该方法,将该方法的返回值直接返回
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
