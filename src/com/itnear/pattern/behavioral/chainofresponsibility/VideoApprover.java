package com.itnear.pattern.behavioral.chainofresponsibility;

/**
 * 描述：视频批准者类
 * 作者：NearJC
 * 时间：2020/02/19
 */
public class VideoApprover extends Approver {

    @Override
    public void deploy(Course course) {
        if (course.getVideo() != null && !"".equals(course.getVideo())) {
            System.out.println("含有视频，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println("不包含视频，不批准,流程结束");
            return;
        }
    }
}
