package org.example.patterns.bridge;

/**
 * 具体的实现化角色
 */
public class RmvbFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb视频文件: " + fileName);
    }
}
