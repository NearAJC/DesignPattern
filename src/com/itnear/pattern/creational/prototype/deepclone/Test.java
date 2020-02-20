package com.itnear.pattern.creational.prototype.deepclone;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        Student s1 = new Student("佩奇", birthday);
        Student s2 = (Student) s1.clone();
        s1.getBirthday().setTime(6666666L);
        System.out.println(s1);
        System.out.println(s2);
    }
}
