package org.example.patterns.singleton.demo8;

public class Singleton {

    private static boolean flag = false;

    private Singleton() {
        synchronized (Singleton.class) {
            //判断flag值为true说明非第一次访问,抛出异常
            if(flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            //将flag的值设置为true
            flag = true;
        }
    }

    private static class SingletonHolder {
        // 在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供公共访问方式
    public static Singleton getInstance() {
        return Singleton.SingletonHolder.INSTANCE;
    }

}
