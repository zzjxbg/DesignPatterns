package org.example.patterns.prototype.test;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        //1.创建一个原型类对象
        Citation citation = new Citation();
        //2.调用Citation类中的clone方法进行对象的克隆
        Citation citation1 = citation.clone();

        citation.setName("张三");
        citation1.setName("李四");

        //调用show方法展示
        citation.show();
        citation1.show();
    }
}
