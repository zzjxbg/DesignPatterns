package org.example.patterns.bridge;

public class Client {
    public static void main(String[] args) {
        //创建mac系统对象
        OperatingSystem system = new Mac(new AviFile());
        //使用操作系统播放视频文件
        system.play("success");
    }
}
