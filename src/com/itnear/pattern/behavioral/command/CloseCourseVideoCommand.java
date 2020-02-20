package com.itnear.pattern.behavioral.command;

/**
 * 描述：关闭课程命令类
 * 作者：NearJC
 * 时间：2020/02/19
 */
public class CloseCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
