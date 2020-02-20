package com.itnear.pattern.structural.composite;

public class Test {
    public static void main(String[] args) {
        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("慕课网课程主目录",1);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程", 2);
        CatalogComponent mmallCourse1 = new Course("Java电商一期", 55);
        CatalogComponent mmallCourse2 = new Course("Java电商二期", 66);
        CatalogComponent designPattern = new Course("Java设计模式", 77);
        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent linuxCourse = new Course("Linux课程", 11);
        CatalogComponent windowsCourse = new Course("Windows课程", 22);

        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();
    }
}
