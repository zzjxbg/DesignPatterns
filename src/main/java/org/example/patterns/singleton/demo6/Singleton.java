package org.example.patterns.singleton.demo6;

/**
 * 枚举方式
 * 原理:枚举类型是线程安全的,并且只会加载一次
 * 枚举类型是所有单例实现中唯一不会被破坏的单例实现模式
 */
public enum Singleton {
    INSTANCE;
}
