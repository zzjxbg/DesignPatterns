package org.example.patterns.singleton.demo7;

import java.io.*;

/**
 * 序列化破坏单例模式
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        writeObject2File();
        readObjectFromFile();
        readObjectFromFile();
    }

    //从文件读数据(对象)
    public static void readObjectFromFile() throws IOException, ClassNotFoundException {
        //1.创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\zhaozijie\\Desktop\\cmd.txt"));
        //2.读取对象
        Singleton instance = (Singleton) ois.readObject();
        System.out.println(instance);
        //3.释放资源
        ois.close();
    }

    //向文件写数据(对象)
    public static void writeObject2File() throws IOException {
        //1.获取Singleton对象
        Singleton instance = Singleton.getInstance();
        //2.创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\zhaozijie\\Desktop\\cmd.txt"));
        //3.写对象
        oos.writeObject(instance);
        //4.释放资源
        oos.close();
    }
}
