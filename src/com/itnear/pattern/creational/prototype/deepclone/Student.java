package com.itnear.pattern.creational.prototype.deepclone;

import java.util.Date;

/**
 * 描述：学生类
 * 作者：NearJC
 * 时间：2020/02/17
 */
public class Student implements Cloneable {

    private String name;

    private Date birthday;

    public Student(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    /**
     * 深度克隆
     *
     * @return 克隆对象
     * @throws CloneNotSupportedException 不支持克隆异常
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.birthday = (Date) student.birthday.clone();
        return student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}' + super.toString();
    }
}
