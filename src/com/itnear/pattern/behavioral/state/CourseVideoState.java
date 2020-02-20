package com.itnear.pattern.behavioral.state;

/**
 * 描述：课程视频状态类
 * 作者：NearJC
 * 时间：2020/02/19
 */
public abstract class CourseVideoState {

    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public abstract void play();

    public abstract void speed();

    public abstract void pause();

    public abstract void stop();
}
