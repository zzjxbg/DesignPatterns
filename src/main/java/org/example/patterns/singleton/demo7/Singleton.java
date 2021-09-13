package org.example.patterns.singleton.demo7;

import java.io.Serializable;

public class Singleton implements Serializable {

    private Singleton() {}

    public static Singleton instance;

    public static Singleton getInstance() {
        instance = new Singleton();
        return instance;
    }
}
