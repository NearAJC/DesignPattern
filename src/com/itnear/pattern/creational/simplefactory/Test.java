package com.itnear.pattern.creational.simplefactory;

public class Test {

    public static void main(String[] args) {
        // 参数类型创建对象
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if (video == null) {
            return;
        }
        video.produce();

        // 反射方式创建对象
        video = videoFactory.getVideo(PythonVideo.class);
        video.produce();
    }
}
