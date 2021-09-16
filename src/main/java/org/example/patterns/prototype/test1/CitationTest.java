package org.example.patterns.prototype.test1;

import java.io.*;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        //1.创建一个原型类对象
        Citation citation = new Citation();
        //创建张三学生对象
        Student stu = new Student();
        stu.setName("张三");
        citation.setStu(stu);

        Citation citation1 = citation.clone();
        Student stu1 = citation1.getStu();
        stu1.setName("李四");

        //调用show方法展示
        citation.show();
        citation1.show();
    }
}
