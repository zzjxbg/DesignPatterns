package org.example.patterns.singleton.demo3;

/**
 * 懒汉式
 */
public class Singleton {

    private Singleton() {}

    private static Singleton instance;

    //对外提供访问方式
    //加入同步锁避免线程安全问题
    public static synchronized Singleton getInstance() {
        //判断instance是否为null,如果为null,说明还没有创建Singleton类的对象
        //如果没有,创建一个并返回,如果有,直接返回
        if(instance == null) {
            //线程1等待,线程2获取到cpu的执行权,也会进入到该判断里
            instance = new Singleton();
        }
        return instance;
    }
}
