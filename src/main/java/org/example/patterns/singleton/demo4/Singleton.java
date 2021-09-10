package org.example.patterns.singleton.demo4;

/**
 * 双重检查锁方式(避免每个线程必须持有锁才能调用该方法,造成性能问题)
 */
public class Singleton {

    private Singleton() {}

    // volatile保证数据可见性,防止指令重排(工作内存和主存数据同步)
    private static volatile Singleton instance;

    // 对外提供公共的访问方式
    public static Singleton getInstance() {
        //第一次判断,如果instance的值不为null,不需要抢占锁,直接返回对象
        if (instance == null) {
            // 同步代码块的锁，在非静态方法中可为this，在静态方法中为当前类本身
            synchronized (Singleton.class) {
                //第二次判断
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
