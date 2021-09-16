package org.example.patterns.prototype.test1;

public class Student implements Cloneable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }
}
