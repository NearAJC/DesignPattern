package com.itnear.pattern.behavioral.command;

/**
 * 描述：打开课程命令类
 * 作者：NearJC
 * 时间：2020/02/19
 */
public class OpenCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
