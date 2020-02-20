package com.itnear.principle.dependenceinversion;

public class Test {

    // 第一个版本，高层模块依赖了低层模块
    // public static void main(String[] args) {
    //     Student student = new Student();
    //     student.studyJavaCourse();
    //     student.studyFECourse();
    // }

    // 第二个版本，方法参数传入接口实现类
    // public static void main(String[] args) {
    //     Student student = new Student();
    //     student.studyImoocCourse(new JavaCourse());
    //     student.studyImoocCourse(new FECourse());
    // }

    // 第三个版本，构造函数传入接口实现类
    // public static void main(String[] args) {
    //     Student student = new Student(new JavaCourse());
    //     student.studyImoocCourse();
    // }

    // 第四版本，通过set方法传入接口实现类
    public static void main(String[] args) {
        Student student = new Student();
        student.setiCourse(new JavaCourse());
        student.studyImoocCourse();

        student.setiCourse(new FECourse());
        student.studyImoocCourse();
    }
}
