package com.itnear.pattern.behavioral.chainofresponsibility;

/**
 * 描述：课程类
 * 作者：NearJC
 * 时间：2020/02/19
 */
public class Course {

    private String name;

    private String article;

    private String video;

    public Course() {

    }

    public Course(String name, String article, String video) {
        this.name = name;
        this.article = article;
        this.video = video;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "CourseVideoState{" +
                "name='" + name + '\'' +
                ", article='" + article + '\'' +
                ", video='" + video + '\'' +
                '}';
    }
}
