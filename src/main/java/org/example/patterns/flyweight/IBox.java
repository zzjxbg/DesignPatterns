package org.example.patterns.flyweight;

/**
 * 具体享元角色
 */
public class IBox extends AbstractBox{

    @Override
    public String getShape() {
        return "I";
    }
}
