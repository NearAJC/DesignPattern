package com.itnear.principle.demeter;

/**
 * 描述：老板类
 * 作者：NearJC
 * 时间：2020/02/16
 */
public class Boss {

//    /**
//     * 根据teamLeader查询在线课程数量 - 不遵守迪米特原则，因为Course与Boss之间有直接关联
//     * @param teamLeader 秘书对象
//     */
//    public void commandCheckNumber(TeamLeader teamLeader) {
//        List<CourseVideoState> courseList = new ArrayList<CourseVideoState>();
//        for (int i = 0; i < 20; i++) {
//            courseList.add(new CourseVideoState());
//        }
//        teamLeader.checkNumberOfCourses(courseList);
//    }

    /**
     * 根据teamLeader查询在线课程数量
     * @param teamLeader 秘书对象
     */
    public void commandCheckNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourses();
    }
}
