package org.example.patterns.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂类
 */
public class ProxyFactory {

    //声明目标对象
    private TrainStation station = new TrainStation();

    //获取代理对象的方法
    public SellTickets getProxyObject() {
        //返回代理对象\
        /**
         * ClassLoader loader: 类加载器,用于加载代理类.可以通过目标对象获取类加载器
         * Class<?>[] interfaces: 代理类实现的接口的字节码对象
         * InvocationHandler: 代理对象的调用处理程序
         */
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    /**
                     * Object proxy: 代理对象,和proxyObject对象是同一个对象,在invoke方法中基本不用
                     * Method method: 对接口中的方法进行封装的method对象(sell方法)
                     * Object[] args: 调用方法的实际参数(sell方法实参)
                     * 返回值: 方法的返回值
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //System.out.println("invoke方法执行了");
                        System.out.println("代售点收取一定的费用(jdk动态代理)");  //sell方法动态增强
                        //执行目标对象的方法
                        Object object = method.invoke(station,args);
                        return object;
                    }
                }
        );
        return proxyObject;
    }
}
