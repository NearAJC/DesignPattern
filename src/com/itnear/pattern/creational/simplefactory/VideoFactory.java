package com.itnear.pattern.creational.simplefactory;

/**
 * 描述： 视频工厂类
 * 作者：NearJC
 * 时间：2020/02/16
 */
public class VideoFactory {

    /**
     * 根据参数传入的类型type，创建对象
     *
     * @param type 类型
     * @return 视频对象
     */
    public Video getVideo(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }

    /**
     * 使用反射方式创建对象
     * @param clazz 类类型
     * @return 视频对象
     */
    public Video getVideo(Class clazz) {
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return video;
    }
}
