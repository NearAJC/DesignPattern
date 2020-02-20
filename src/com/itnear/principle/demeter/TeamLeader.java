package com.itnear.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：秘书类
 * 作者：NearJC
 * 时间：2020/02/16
 */
public class TeamLeader {

//    /**
//     * 查询在线课程数量 - 不遵守迪米特原则
//     * @param courseList 课程集合
//     */
//    public void checkNumberOfCourses(List<CourseVideoState> courseList) {
//        System.out.println("在线课程的数量是：" + courseList.size());
//    }

    /**
     * 查询在线课程数量 - 不遵守迪米特原则
     */
    public void checkNumberOfCourses() {
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是：" + courseList.size());
    }
}
