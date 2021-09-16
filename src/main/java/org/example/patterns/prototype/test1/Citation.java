package org.example.patterns.prototype.test1;

public class Citation implements Cloneable{

//    //三好学生上的姓名
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public void show() {
        System.out.println(stu.getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        /**
         * 深克隆:在citation的clone中把student克隆一下,这样在克隆citation时相当于
         * 把citation的成员变量以及student中的成员变量全部克隆了一下
         */
        Citation citation= (Citation) super.clone();
        citation.stu = stu.clone();
        return citation;
    }
}
